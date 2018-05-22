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
	height: 47.25pt;
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

	<table class="t1">
		<colgroup>
			<col width="112">
			<col width="100">
			<col width="93">
			<col width="73">
			<col width="87">
			<col width="97">
			<col width="93">
			<col width="82">
			<col width="89">
			<col width="66">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="11">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="4">羊棘球蚴（包虫）病基因工程亚单位疫苗</td>
				<td class="c2" rowspan="2">应免数量</td>
				<td class="c2" rowspan="2">免疫进展</td>
			</tr>
			<tr class="r3">
				<td class="c2">本周疫苗使用数量（万毫升）</td>
				<td class="c2">累计疫苗使用数量(万毫升)</td>
				<td class="c2">本周免疫数量（万头）</td>
				<td class="c2">累计免疫数量(万头)</td>
				
			</tr>
			<#assign echInactivatedvaccineSum=0>
			<#assign echInactivatedvaccine_ljSum=0>
			<#assign echInactivatedimmuneamountSum=0>
			<#assign echInactivatedimmuneamount_ljSum=0>
		
			<#assign immuneEchSheep_ljSum=0>
			<#list items as item>
				<#assign echInactivatedvaccineSum=echInactivatedvaccineSum?default(0) +item.echInactivatedvaccine?default(0)>
				<#assign echInactivatedvaccine_ljSum=echInactivatedvaccine_ljSum?default(0) +cumulatives[item_index].echInactivatedvaccine?default(0)>
				<#assign echInactivatedimmuneamountSum=echInactivatedimmuneamountSum?default(0) +item.echInactivatedimmuneamount?default(0)>
				<#assign echInactivatedimmuneamount_ljSum=echInactivatedimmuneamount_ljSum?default(0) +cumulatives[item_index].echInactivatedimmuneamount?default(0)>
				<#assign immuneEchSheep_ljSum=immuneEchSheep_ljSum?default(0) +wlivestockinouts[item_index].immuneEchSheep?default(0)>
			<tr class="r4">
				<td  class="c2"><#if item.echRegionname??>${item.echRegionname}</#if></td>
				<td class="c2"><#if item.echInactivatedvaccine??>${item.echInactivatedvaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].echInactivatedvaccine??>${cumulatives[item_index].echInactivatedvaccine}</#if></td>
				<td class="c2"><#if item.echInactivatedimmuneamount??>${item.echInactivatedimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].echInactivatedimmuneamount??>${cumulatives[item_index].echInactivatedimmuneamount}</#if></td>

				<td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immuneEchSheep??>${wlivestockinouts[item_index].immuneEchSheep}</#if></td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&& wlivestockinouts[item_index].immuneEchSheep??&& wlivestockinouts[item_index].immuneEchSheep>0)>
						<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
						${(cumulatives[item_index].echInactivatedimmuneamount?default(0))*100/wlivestockinouts[item_index].immuneEchSheep}%</#if></#if>
				</td>
			</tr>
      </#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="echInactivatedvaccineSum" class="c2"><#if echInactivatedvaccineSum??>${echInactivatedvaccineSum}</#if></td>
                <td n="echInactivatedvaccine_ljSum" class="c2"><#if echInactivatedvaccine_ljSum??>${echInactivatedvaccine_ljSum}</#if></td>
                <td n="echInactivatedimmuneamountSum" class="c2"><#if echInactivatedimmuneamountSum??>${echInactivatedimmuneamountSum}</#if></td>
                <td n="echInactivatedimmuneamount_ljSum" class="c2"><#if echInactivatedimmuneamount_ljSum??>${echInactivatedimmuneamount_ljSum}</#if></td>
                
                <td n="immuneEchSheep_ljSum" class="c2"><#if immuneEchSheep_ljSum??>${immuneEchSheep_ljSum}</#if></td>
                <td  class="c2"><#if (immuneEchSheep_ljSum>0)>${(echInactivatedimmuneamount_ljSum?default(0))*100/immuneEchSheep_ljSum}%</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
