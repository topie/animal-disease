package com.topie.webservice.service.impl;

import com.topie.animal.service.IOrgInfoService;
import com.topie.animal.service.IUserInfoService;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.webservice.service.IUserWebService;
import net.sf.json.JSONObject;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;

/**
 * Created by chenguojun on 2017/4/21.
 */
@Service
public class UserWebServiceImpl implements IUserWebService {

    private static final int CREATEUSER = 11;

    private static final int UPDATEUSER = 12;

    private static final int DELETEUSER = 13;

    private static final int CREATEROLE = 21;

    private static final int UPDATEROLE = 22;

    private static final int DELETEROLE = 23;

    private static final int CREATEDEPT = 41;

    private static final int UPDATEDEPT = 42;

    private static final int DELETEDEPT = 43;

    /**
     * 后加
     **/
    private static final int CREATEDIVISION = 51;

    private static final int UPDATEDIVISION = 52;

    private static final int DELETEDIVISION = 53;

    private static final String CREATEDIVISIONNOONE = "1101";

    private static final String CREATEDIVISIONNOPARENT = "1102";

    private static final String CREATEDIVISIONHASNAME = "1103";

    private static final String CREATEDIVISIONHASCODE = "1104";

    private static final String UPDATEDIVISIONNOEXIT = "1201";

    private static final String UPDATEDIVISIONNOPARENT = "1202";

    private static final String UPDATEDIVISIONHASCODE = "1203";

    private static final String UPDATEDIVISIONHASNAME = "1204";

    private static final String DELETEDIVISIONNOEXIT = "1301";

    private static final String DELETEDIVISIONHASCHILD = "1302";

    private static final String DELETEDIVISIONHASDEPT = "1303";

    private static final String CREATEDEPTNOREGION = "104";

    private static final String UPDATEDEPTNOREGION = "304";

    private static final String CENTERNORETURNERROR = "1003";

    /****/

    private static final String SUCCESS = "000";

    private static final String CREATEDEPTNOONE = "101";

    private static final String CREATEDEPTNOPARENT = "102";

    private static final String CREATEDEPTHASNAME = "103";

    private static final String DELETEDEPTNOEXIT = "201";

    private static final String DELETEDEPTHASCHILD = "202";

    private static final String DELETEDEPTHASUSER = "203";

    private static final String DELETEDEPTHASROLE = "204";

    private static final String UPDATEDEPTNOEXIT = "301";

    private static final String UPDATEDEPTNOPARENT = "302";

    private static final String UPDATEDEPTHASNAME = "303";

    private static final String CREATEUSERNOONE = "401";

    private static final String CREATEUSERNOROLE = "402";

    private static final String CREATEUSERNODEPT = "403";

    private static final String DELETEUSERNOEXIT = "601";

    private static final String UPDATEUSERNOEXIT = "501";

    private static final String UPDATEUSERNOROLE = "502";

    private static final String UPDATEUSERNODEPT = "503";

    private static final String CREATEROLENOONE = "701";

    private static final String CREATEROLEHASNAME = "702";

    private static final String CREATEROLENODEPT = "703";

    private static final String DELETEROLENOEXIT = "901";

    private static final String UPDATEROLENOEXIT = "801";

    private static final String UPDATEROLEHASNAME = "802";

    private static final String UPDATEROLENODEPT = "803";

    private static final String CREATEROLENOAPP = "704";

    private static final String FORMATERROR = "1001";

    private static final String OTHERERROR = "1002";

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private IOrgInfoService iOrgInfoService;

    @Override
    public String SynchronizedInfo(String jsonString) {
        JSONObject jsonObject = JSONObject.fromObject(jsonString);
        String opType = (String) jsonObject.get("opType");
        String infoCode = (String) jsonObject.get("infoCode");
        if (StringUtils.isEmpty(opType) || StringUtils.isEmpty(infoCode)) {
            return OTHERERROR;
        }
        String result = OTHERERROR;
        int operateId = Integer.parseInt(opType);
        if (operateId == CREATEDEPT || operateId == UPDATEDEPT || operateId == DELETEDEPT) {
            result = synDept(operateId, infoCode);
        } else if (operateId == CREATEUSER || operateId == UPDATEUSER || operateId == DELETEUSER) {
            result = synUser(operateId, infoCode);

        }
        return result;
    }

    private String synUser(int operateId, String infoCode) {
        RPCServiceClient serviceClient = null;
        try {
            serviceClient = new RPCServiceClient();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            return OTHERERROR;
        }

        Options options = serviceClient.getOptions();
        EndpointReference targetEPR = new EndpointReference(
                "http://192.168.23.1:8098/zcpt/services/synInfoService?wsdl");
        options.setTo(targetEPR);
        QName qName = new QName("http://impl.service.app.com", "getUserInfo");
        Object[] objects = new Object[] { infoCode };
        try {
            Class[] returnTypes = new Class[] { String.class };
            Object[] response = serviceClient.invokeBlocking(qName, objects, returnTypes);
            String userInfo = (String) response[0];
            serviceClient.cleanupTransport();
            //获取用户信息
            JSONObject jsonObject = JSONObject.fromObject(userInfo);
            //jsonObject.get(属性)
            String userId = (String) jsonObject.get("userId");
            UserInfo u = new UserInfo();
            u.setUserId(userId);
            switch (operateId) {
                case CREATEUSER:
                    iUserInfoService.insertOrUpdatePlatformUser(u);
                    break;
                case UPDATEUSER:
                    iUserInfoService.insertOrUpdatePlatformUser(u);
                    break;
                case DELETEUSER:
                    iUserInfoService.delete(userId);
                    break;
                default:
                    return OTHERERROR;
            }

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            return OTHERERROR;
        }
        return SUCCESS;
    }

    private String synDept(int operateId, String infoCode) {
        RPCServiceClient serviceClient = null;
        try {
            serviceClient = new RPCServiceClient();
        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            return OTHERERROR;
        }
        Options options = serviceClient.getOptions();
        EndpointReference targetEPR = new EndpointReference(
                "http://192.168.23.1:8098/zcpt/services/synInfoService?wsdl");
        options.setTo(targetEPR);
        QName qName = new QName("http://impl.service.app.com", "getUserInfo");
        Object[] objects = new Object[] { infoCode };
        try {
            Class[] returnTypes = new Class[] { String.class };
            Object[] response = serviceClient.invokeBlocking(qName, objects, returnTypes);
            String orgInfo = (String) response[0];
            serviceClient.cleanupTransport();
            System.out.println(orgInfo);
            JSONObject jsonObject = JSONObject.fromObject(orgInfo);
            String orgId = (String) jsonObject.get("orgId");
            OrgInfo o = new OrgInfo();
            o.setOrgId(orgId);
            switch (operateId) {
                case CREATEDEPT:
                    iOrgInfoService.save(o);
                    break;
                case UPDATEDEPT:
                    iOrgInfoService.updateNotNull(o);
                    break;
                case DELETEDEPT:
                    iOrgInfoService.delete(orgId);
                    break;
                default:
                    return OTHERERROR;
            }

        } catch (AxisFault axisFault) {
            axisFault.printStackTrace();
            return OTHERERROR;
        }
        return SUCCESS;
    }
}
