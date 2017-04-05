<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
	white-space-collapsing: preserve;
}

.t1 {
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
				<td class="c2" colspan="4">高致病性猪蓝耳病灭活疫苗</td>
				<td class="c2" colspan="4">高致病性猪蓝耳病活疫苗</td>
				<td class="c2" rowspan="2">应免数量</td>
				<td class="c2" rowspan="2">免疫进展</td>
			</tr>
			<tr class="r3">
				<td class="c2">本周疫苗使用数量（万毫升）</td>
				<td class="c2">累计疫苗使用数量(万毫升)</td>
				<td class="c2">本周免疫数量（万头）</td>
				<td class="c2">累计免疫数量(万头)</td>
				<td class="c2">本周疫苗使用数量（万头份）</td>
				<td class="c2">累计疫苗使用数量(万头份)</td>
				<td class="c2">本周免疫数量（万头）</td>
				<td class="c2">累计免疫数量(万头)</td>
			</tr>
			<#assign bedInactivatedvaccineSum=0>
			<#assign bedInactivatedvaccine_ljSum=0>
			<#assign bedInactivatedimmuneamountSum=0>
			<#assign bedInactivatedimmuneamount_ljSum=0>
			<#assign bedWeakvaccineSum=0>
			<#assign bedWeakvaccine_ljSum=0>
			<#assign bedWeakimmuneamountSum=0>
			<#assign bedWeakimmuneamount_ljSum=0>
			<#assign immuneblueear_ljSum=0>
			<#list items as item>
				<#assign bedInactivatedvaccineSum=bedInactivatedvaccineSum?default(0) +item.bedInactivatedvaccine?default(0)>
				<#assign bedInactivatedvaccine_ljSum=bedInactivatedvaccine_ljSum?default(0) +cumulatives[item_index].bedInactivatedvaccine?default(0)>
				<#assign bedInactivatedimmuneamountSum=bedInactivatedimmuneamountSum?default(0) +item.bedInactivatedimmuneamount?default(0)>
				<#assign bedInactivatedimmuneamount_ljSum=bedInactivatedimmuneamount_ljSum?default(0) +cumulatives[item_index].bedInactivatedimmuneamount?default(0)>
				<#assign bedWeakvaccineSum=bedWeakvaccineSum?default(0) +item.bedWeakvaccine?default(0)>
				<#assign bedWeakvaccine_ljSum=bedWeakvaccine_ljSum?default(0) +cumulatives[item_index].bedWeakvaccine?default(0)>
				<#assign bedWeakimmuneamountSum=bedWeakimmuneamountSum?default(0) +item.bedWeakimmuneamount?default(0)>
				<#assign bedWeakimmuneamount_ljSum=bedWeakimmuneamount_ljSum?default(0) +cumulatives[item_index].bedWeakimmuneamount?default(0)>
				<#assign immuneblueear_ljSum=immuneblueear_ljSum?default(0) +wlivestockinouts[item_index].immuneblueear?default(0)>
			<tr class="r4">
				<td  class="c2"><#if item.bedRegionname??>${item.bedRegionname}</#if></td>
				
				<td class="c2"><#if item.bedInactivatedvaccine??>${item.bedInactivatedvaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bedInactivatedvaccine??>${cumulatives[item_index].bedInactivatedvaccine}</#if></td>
				<td class="c2"><#if item.bedInactivatedimmuneamount??>${item.bedInactivatedimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bedInactivatedimmuneamount??>${cumulatives[item_index].bedInactivatedimmuneamount}</#if></td>
				
				<td class="c2"><#if item.bedWeakvaccine??>${item.bedWeakvaccine}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bedWeakvaccine??>${cumulatives[item_index].bedWeakvaccine}</#if></td>
				<td class="c2"><#if item.bedWeakimmuneamount??>${item.bedWeakimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bedWeakimmuneamount??>${cumulatives[item_index].bedWeakimmuneamount}</#if></td>
				
				<td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immuneblueear??>${wlivestockinouts[item_index].immuneblueear}</#if></td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&& wlivestockinouts[item_index].immuneblueear??&& wlivestockinouts[item_index].immuneblueear>0)>
						<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
						${(cumulatives[item_index].bedInactivatedimmuneamount?default(0)+cumulatives[item_index].bedWeakimmuneamount?default(0))*100/wlivestockinouts[item_index].immuneblueear}%</#if></#if>
				</td>
			</tr>
      </#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="bedInactivatedvaccineSum" class="c2"><#if bedInactivatedvaccineSum??>${bedInactivatedvaccineSum}</#if></td>
                <td n="bedInactivatedvaccine_ljSum" class="c2"><#if bedInactivatedvaccine_ljSum??>${bedInactivatedvaccine_ljSum}</#if></td>
                <td n="bedInactivatedimmuneamountSum" class="c2"><#if bedInactivatedimmuneamountSum??>${bedInactivatedimmuneamountSum}</#if></td>
                <td n="bedInactivatedimmuneamount_ljSum" class="c2"><#if bedInactivatedimmuneamount_ljSum??>${bedInactivatedimmuneamount_ljSum}</#if></td>
                <td n="bedWeakvaccineSum" class="c2"><#if bedWeakvaccineSum??>${bedWeakvaccineSum}</#if></td>
                <td n="bedWeakvaccine_ljSum" class="c2"><#if bedWeakvaccine_ljSum??>${bedWeakvaccine_ljSum}</#if></td>
                <td n="bedWeakimmuneamountSum" class="c2"><#if bedWeakimmuneamountSum??>${bedWeakimmuneamountSum}</#if></td>
                <td n="bedWeakimmuneamount_ljSum" class="c2"><#if bedWeakimmuneamount_ljSum??>${bedWeakimmuneamount_ljSum}</#if></td>
                <td n="immuneblueear_ljSum" class="c2"><#if immuneblueear_ljSum??>${immuneblueear_ljSum}</#if></td>
                <td  class="c2"><#if (immuneblueear_ljSum>0)>${(bedInactivatedimmuneamount_ljSum?default(0)+bedWeakimmuneamount_ljSum?default(0))*100/immuneblueear_ljSum}%</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
