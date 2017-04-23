package com.topie.axis2;

import com.topie.database.core.animal.model.UserInfo;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

import javax.xml.namespace.QName;

public class JsonClient {

    public static void main(String[] args1) throws AxisFault {

        RPCServiceClient serviceClient = new RPCServiceClient();

        Options options = serviceClient.getOptions();

        EndpointReference targetEPR = new EndpointReference("http://localhost:8080/animal-disease/services/userService/echoUser");
        options.setTo(targetEPR);

        // /////////////////////////////////////////////////////////////////////

        /*
         * Creates an Entry and stores it in the AddressBook.
         */

        // QName of the target method
        QName qName = new QName("http://service.webservice.topie.com", "echoUser");
        /*
         * Constructing a new Entry
         */
        UserInfo entry = new UserInfo();

        entry.setLeaderName("Abby Cadabby");

        // Constructing the arguments array for the method invocation
        Object[] opAddEntryArgs = new Object[] { entry };

        // Invoking the method
        serviceClient.invokeRobust(qName, opAddEntryArgs);

    }
}
