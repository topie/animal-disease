<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {width:100%;
	border-collapse: collapse;
	border-spacing: 0;
}

.r1 {
	height: 26.25pt;
}

.r2 {
	height: 16.5pt;
}

.r3 {
	height: 38.25pt;
}

.r4 {
	height: 19.5pt;
}

.r5 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 16pt;
}

.c2 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1" width="100%">
		<colgroup>
			<col width="112">
			<col width="100">
			<col width="93">
			<col width="73">
			<col width="87">
			<col width="93">
			<col width="96">
			<col width="83">
			<col width="84">
			<col width="75">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="11">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="4">新城疫灭活疫苗</td>
				<td class="c2" colspan="4">新城疫弱毒疫苗</td>
				<td class="c2" rowspan="2">应免数量</td>
				<td class="c2" rowspan="2">免疫进展</td>
			</tr>
			<tr class="r3">
				<td class="c2">本周疫苗使用数量（万毫升）</td>
				<td class="c2">累计疫苗使用数量(万羽份)</td>
				<td class="c2">本周免疫数量（万羽）</td>
				<td class="c2">累计免疫数量(万羽)</td>
				<td class="c2">本周疫苗使用数量（万羽份）</td>
				<td class="c2">累计疫苗使用数量(万羽份)</td>
				<td class="c2">本周免疫数量（万羽）</td>
				<td class="c2">累计免疫数量(万羽)</td>
			</tr>
			<#assign ncInactivatedvaccineSum=0>
			<#assign ncInactivatedvaccine_ljSum=0>
			<#assign ncInactivatedimmuneamountSum=0>
			<#assign ncInactivatedimmuneamount_ljSum=0>
			<#assign ncJointvaccineSum=0>
			<#assign ncJointvaccine_ljSum=0>
			<#assign ncJointimmuneamountSum=0>
			<#assign ncJointimmuneamount_ljSum=0>
			<#assign immunenewcastle_ljSum=0>
			<#list items as item>
				<#assign ncInactivatedvaccineSum=ncInactivatedvaccineSum?default(0) +item.ncInactivatedvaccine?default(0)>
				<#assign ncInactivatedvaccine_ljSum=ncInactivatedvaccine_ljSum?default(0) +cumulatives[item_index].ncInactivatedvaccine?default(0)>
				<#assign ncInactivatedimmuneamountSum=ncInactivatedimmuneamountSum?default(0) +item.ncInactivatedimmuneamount?default(0)>
				<#assign ncInactivatedimmuneamount_ljSum=ncInactivatedimmuneamount_ljSum?default(0) +cumulatives[item_index].ncInactivatedimmuneamount?default(0)>

				<#assign ncJointvaccineSum=ncJointvaccineSum?default(0) +item.ncJointvaccine?default(0)>
				<#assign ncJointvaccine_ljSum=ncJointvaccine_ljSum?default(0) +cumulatives[item_index].ncJointvaccine?default(0)>
				<#assign ncJointimmuneamountSum=ncJointimmuneamountSum?default(0) +item.ncJointimmuneamount?default(0)>
				<#assign ncJointimmuneamount_ljSum=ncJointimmuneamount_ljSum?default(0) +cumulatives[item_index].ncJointimmuneamount?default(0)>
			
				<#assign immunenewcastle_ljSum=immunenewcastle_ljSum?default(0) +wlivestockinouts[item_index].immunenewcastle?default(0)>
			<tr class="r4">
				<td n="ncRegionname"  class="c2"><#if item.ncRegionname??>${item.ncRegionname}</#if></td>
				<td n="ncInactivatedvaccine"  class="c2"><#if item.ncInactivatedvaccine??>${item.ncInactivatedvaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].ncInactivatedvaccine??>${cumulatives[item_index].ncInactivatedvaccine}</#if></td>
				<td n="ncInactivatedimmuneamount"  class="c2"><#if item.ncInactivatedimmuneamount??>${item.ncInactivatedimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].ncInactivatedimmuneamount??>${cumulatives[item_index].ncInactivatedimmuneamount}</#if></td>
				
				<td n="ncJointvaccine"  class="c2"><#if item.ncJointvaccine??>${item.ncJointvaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].ncJointvaccine??>${cumulatives[item_index].ncJointvaccine}</#if></td>
                <td n="ncJointimmuneamount"  class="c2"><#if item.ncJointimmuneamount??>${item.ncJointimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].ncJointimmuneamount??>${cumulatives[item_index].ncJointimmuneamount}</#if></td>
				
                <td n=""  class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immunenewcastle??>${wlivestockinouts[item_index].immunenewcastle}</#if></td>
				<td n=""  class="c2">
					<#if  (wlivestockinouts[item_index]??&& wlivestockinouts[item_index].immunenewcastle??&& wlivestockinouts[item_index].immunenewcastle>0)><#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>${(cumulatives[item_index].ncJointimmuneamount?default(0)+cumulatives[item_index].ncInactivatedimmuneamount?default(0))*100/wlivestockinouts[item_index].immunenewcastle}%</#if></#if>
				</td>
			</tr>
  </#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="ncInactivatedvaccineSum" class="c2"><#if ncInactivatedvaccineSum??>${ncInactivatedvaccineSum}</#if></td>
                <td n="ncInactivatedvaccine_ljSum" class="c2"><#if ncInactivatedvaccine_ljSum??>${ncInactivatedvaccine_ljSum}</#if></td>
                <td n="ncInactivatedimmuneamountSum" class="c2"><#if ncInactivatedimmuneamountSum??>${ncInactivatedimmuneamountSum}</#if></td>
                <td n="ncInactivatedimmuneamount_ljSum" class="c2"><#if ncInactivatedimmuneamount_ljSum??>${ncInactivatedimmuneamount_ljSum}</#if></td>
                <td n="ncJointvaccineSum" class="c2"><#if ncJointvaccineSum??>${ncJointvaccineSum}</#if></td>
                <td n="ncJointvaccine_ljSum" class="c2"><#if ncJointvaccine_ljSum??>${ncJointvaccine_ljSum}</#if></td>
                <td n="ncJointimmuneamountSum" class="c2"><#if ncJointimmuneamountSum??>${ncJointimmuneamountSum}</#if></td>
                <td n="ncJointimmuneamount_ljSum" class="c2"><#if ncJointimmuneamount_ljSum??>${ncJointimmuneamount_ljSum}</#if></td>
                <td n="immunenewcastle_ljSum" class="c2"><#if immunenewcastle_ljSum??>${immunenewcastle_ljSum}</#if></td>
                <td  class="c2"><#if (immunenewcastle_ljSum>0)>${(ncInactivatedimmuneamount_ljSum?default(0)+ncJointimmuneamount_ljSum?default(0))*100/immunenewcastle_ljSum}%</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
