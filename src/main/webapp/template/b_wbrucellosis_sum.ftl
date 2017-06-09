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
				<td class="c1" colspan="23">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
				<td class="c2" colspan="6">布氏菌病活疫苗(S2株)</td>
				<td class="c2" colspan="6">布氏菌病活疫苗(A19株)</td>
                <td class="c2" colspan="6">布氏菌病活疫苗(M5株)</td>
				<td class="c2" rowspan="2" colspan="2">应免数量</td>
				<td class="c2" rowspan="2" colspan="2">免疫进展</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">本周疫苗使用数量（万毫升）</td>
				<td class="c2" rowspan="2">累计疫苗使用数量(万毫升)</td>
				<td class="c2" colspan="2">本周免疫数量（万头）</td>
				<td class="c2" colspan="2">累计免疫数量(万头)</td>
				<td class="c2" rowspan="2">本周疫苗使用数量（万头份）</td>
				<td class="c2" rowspan="2">累计疫苗使用数量(万头份)</td>
				<td class="c2" colspan="2">本周免疫数量（万头）</td>
				<td class="c2" colspan="2">累计免疫数量(万头)</td>
                <td class="c2" rowspan="2">本周疫苗使用数量（万毫升）</td>
                <td class="c2" rowspan="2">累计疫苗使用数量(万毫升)</td>
                <td class="c2" colspan="2">本周免疫数量（万头）</td>
                <td class="c2" colspan="2">累计免疫数量(万头)</td>
			</tr>
            <tr class="r3">
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>
                <td class="c2">牛</td>
                <td class="c2">羊</td>

            </tr>
			<#assign bruS2vaccineuseSum=0>
			<#assign bruS2vaccineuse_ljSum=0>
			<#assign bruS2niuimmuneamountSum=0>
			<#assign bruS2niuimmuneamount_ljSum=0>
			<#assign bruS2sheepimmuneamountSum=0>
			<#assign bruS2sheepimmuneamount_ljSum=0>
			<#assign bruA19vaccineuseSum=0>
			<#assign bruA19vaccineuse_ljSum=0>
			<#assign immuneBruniu_ljSum=0>
			<#assign bruA19niuimmuneamountSum=0>
			<#assign bruA19niuimmuneamount_ljSum=0>
			<#assign bruA19sheepimmuneamountSum=0>
			<#assign bruA19sheepimmuneamount_ljSum=0>
			<#assign bruM5vaccineuseSum=0>
			<#assign bruM5vaccineuse_ljSum=0>
			<#assign bruM5niuimmuneamountSum=0>
			<#assign bruM5niuimmuneamount_ljSum=0>
			<#assign immuneBruSheep_ljSum=0>
			<#assign bruM5sheepimmuneamountSum=0>
			<#assign bruM5sheepimmuneamount_ljSum=0>
			<#list items as item>
				<#assign bruS2vaccineuseSum=bruS2vaccineuseSum?default(0) +item.bruS2vaccineuse?default(0)>
				<#assign bruS2vaccineuse_ljSum=bruS2vaccineuse_ljSum?default(0) +cumulatives[item_index].bruS2vaccineuse?default(0)>
				<#assign bruS2niuimmuneamountSum=bruS2niuimmuneamountSum?default(0) +item.bruS2niuimmuneamount?default(0)>
				<#assign bruS2niuimmuneamount_ljSum=bruS2niuimmuneamount_ljSum?default(0) +cumulatives[item_index].bruS2niuimmuneamount?default(0)>
				<#assign bruS2sheepimmuneamountSum=bruS2sheepimmuneamountSum?default(0) +item.bruS2sheepimmuneamount?default(0)>
				<#assign bruS2sheepimmuneamount_ljSum=bruS2sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].bruS2sheepimmuneamount?default(0)>
				<#assign bruA19vaccineuseSum=bruA19vaccineuseSum?default(0) +item.bruA19vaccineuse?default(0)>
				<#assign bruA19vaccineuse_ljSum=bruA19vaccineuse_ljSum?default(0) +cumulatives[item_index].bruA19vaccineuse?default(0)>
				<#assign immuneBruniu_ljSum=immuneBruniu_ljSum?default(0) +wlivestockinouts[item_index].immuneBruniu?default(0)>
				<#assign bruA19niuimmuneamountSum=bruA19niuimmuneamountSum?default(0) +item.bruA19niuimmuneamount?default(0)>
				<#assign bruA19niuimmuneamount_ljSum=bruA19niuimmuneamount_ljSum?default(0) +cumulatives[item_index].bruA19niuimmuneamount?default(0)>
				<#assign bruA19sheepimmuneamountSum=bruA19sheepimmuneamountSum?default(0) +item.bruA19sheepimmuneamount?default(0)>
				<#assign bruA19sheepimmuneamount_ljSum=bruA19sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].bruA19sheepimmuneamount?default(0)>
				<#assign bruM5vaccineuseSum=bruM5vaccineuseSum?default(0) +item.bruM5vaccineuse?default(0)>
				<#assign bruM5vaccineuse_ljSum=bruM5vaccineuse_ljSum?default(0) +cumulatives[item_index].bruM5vaccineuse?default(0)>
				<#assign bruM5niuimmuneamountSum=bruM5niuimmuneamountSum?default(0) +item.bruM5niuimmuneamount?default(0)>
				<#assign bruM5niuimmuneamount_ljSum=bruM5niuimmuneamount_ljSum?default(0) +cumulatives[item_index].bruM5niuimmuneamount?default(0)>
				<#assign immuneBruSheep_ljSum=immuneBruSheep_ljSum?default(0) +wlivestockinouts[item_index].immuneBruSheep?default(0)>
				<#assign bruM5sheepimmuneamountSum=bruM5sheepimmuneamountSum?default(0) +item.bruM5sheepimmuneamount?default(0)>
				<#assign bruM5sheepimmuneamount_ljSum=bruM5sheepimmuneamount_ljSum?default(0) +cumulatives[item_index].bruM5sheepimmuneamount?default(0)>
			<tr class="r4">
				<td  class="c2"><#if item.bruRegionname??>${item.bruRegionname}</#if></td>
				
				<td class="c2"><#if item.bruS2vaccineuse??>${item.bruS2vaccineuse}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruS2vaccineuse??>${cumulatives[item_index].bruS2vaccineuse}</#if></td>
				<td class="c2"><#if item.bruS2niuimmuneamount??>${item.bruS2niuimmuneamount}</#if></td>
				<td class="c2"><#if item.bruS2sheepimmuneamount??>${item.bruS2sheepimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruS2niuimmuneamount??>${cumulatives[item_index].bruS2niuimmuneamount}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruS2sheepimmuneamount??>${cumulatives[item_index].bruS2sheepimmuneamount}</#if></td>
				<td class="c2"><#if item.bruA19vaccineuse??>${item.bruA19vaccineuse}</#if></td>
				<td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruA19vaccineuse??>${cumulatives[item_index].bruA19vaccineuse}</#if></td>

                <td class="c2"><#if item.bruA19niuimmuneamount??>${item.bruA19niuimmuneamount}</#if></td>
                <td class="c2"><#if item.bruA19sheepimmuneamount??>${item.bruA19sheepimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruA19niuimmuneamount??>${cumulatives[item_index].bruA19niuimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruA19sheepimmuneamount??>${cumulatives[item_index].bruA19sheepimmuneamount}</#if></td>

                <td class="c2"><#if item.bruM5vaccineuse??>${item.bruM5vaccineuse}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruM5vaccineuse??>${cumulatives[item_index].bruM5vaccineuse}</#if></td>
                <td class="c2"><#if item.bruM5niuimmuneamount??>${item.bruM5niuimmuneamount}</#if></td>
                <td class="c2"><#if item.bruM5sheepimmuneamount??>${item.bruM5sheepimmuneamount}</#if></td>
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruM5niuimmuneamount??>${cumulatives[item_index].bruM5niuimmuneamount}</#if></td>

               
                <td class="c2"><#if cumulatives[item_index]??&&cumulatives[item_index].bruM5sheepimmuneamount??>${cumulatives[item_index].bruM5sheepimmuneamount}</#if></td>

                <td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immuneBruniu??>${wlivestockinouts[item_index].immuneBruniu}</#if></td>
                <td class="c2"><#if wlivestockinouts[item_index]??&&wlivestockinouts[item_index].immuneBruSheep??>${wlivestockinouts[item_index].immuneBruSheep}</#if></td>
                <td class="c2">
					<#if  (wlivestockinouts[item_index]??&& wlivestockinouts[item_index].immuneBruniu??&& wlivestockinouts[item_index].immuneBruniu>0)>
						<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
						${(cumulatives[item_index].bruS2niuimmuneamount?default(0)+cumulatives[item_index].bruA19niuimmuneamount?default(0)+cumulatives[item_index].bruM5niuimmuneamount?default(0))*100/wlivestockinouts[item_index].immuneBruniu}%</#if></#if>
                </td>
				<td class="c2">
					<#if  (wlivestockinouts[item_index]??&& wlivestockinouts[item_index].immuneBruSheep??&& wlivestockinouts[item_index].immuneBruSheep>0)>
						<#if wlivestockinouts[item_index]??&&cumulatives[item_index]??>
						${(cumulatives[item_index].bruS2sheepimmuneamount?default(0)+cumulatives[item_index].bruA19sheepimmuneamount?default(0)+cumulatives[item_index].bruM5sheepimmuneamount?default(0))*100/wlivestockinouts[item_index].immuneBruSheep}%</#if></#if>
				</td>
			</tr>
      </#list>
            <tr class="r4">
                <td  class="c2">合计</td>
                <td n="bruS2vaccineuseSum" class="c2"><#if bruS2vaccineuseSum??>${bruS2vaccineuseSum}</#if></td>
                <td n="bruS2vaccineuse_ljSum" class="c2"><#if bruS2vaccineuse_ljSum??>${bruS2vaccineuse_ljSum}</#if></td>
                <td n="bruS2niuimmuneamountSum" class="c2"><#if bruS2niuimmuneamountSum??>${bruS2niuimmuneamountSum}</#if></td>
                <td n="bruS2sheepimmuneamountSum" class="c2"><#if bruS2sheepimmuneamountSum??>${bruS2sheepimmuneamountSum}</#if></td>
                <td n="bruS2niuimmuneamount_ljSum" class="c2"><#if bruS2niuimmuneamount_ljSum??>${bruS2niuimmuneamount_ljSum}</#if></td>
                <td n="bruS2sheepimmuneamount_ljSum" class="c2"><#if bruS2sheepimmuneamount_ljSum??>${bruS2sheepimmuneamount_ljSum}</#if></td>
                <td n="bruA19vaccineuseSum" class="c2"><#if bruA19vaccineuseSum??>${bruA19vaccineuseSum}</#if></td>
                <td n="bruA19vaccineuse_ljSum" class="c2"><#if bruA19vaccineuse_ljSum??>${bruA19vaccineuse_ljSum}</#if></td>

                <td n="bruA19niuimmuneamountSum" class="c2"><#if bruA19niuimmuneamountSum??>${bruA19niuimmuneamountSum}</#if></td>
                <td n="bruA19sheepimmuneamountSum" class="c2"><#if bruA19sheepimmuneamountSum??>${bruA19sheepimmuneamountSum}</#if></td>
                <td n="bruA19niuimmuneamount_ljSum" class="c2"><#if bruA19niuimmuneamount_ljSum??>${bruA19niuimmuneamount_ljSum}</#if></td>
                <td n="bruA19sheepimmuneamount_ljSum" class="c2"><#if bruA19sheepimmuneamount_ljSum??>${bruA19sheepimmuneamount_ljSum}</#if></td>
                <td n="bruM5vaccineuseSum" class="c2"><#if bruM5vaccineuseSum??>${bruM5vaccineuseSum}</#if></td>
                <td n="bruM5vaccineuse_ljSum" class="c2"><#if bruM5vaccineuse_ljSum??>${bruM5vaccineuse_ljSum}</#if></td>
                <td n="bruM5niuimmuneamountSum" class="c2"><#if bruM5niuimmuneamountSum??>${bruM5niuimmuneamountSum}</#if></td>
                
                <td n="bruM5sheepimmuneamountSum" class="c2"><#if bruM5sheepimmuneamountSum??>${bruM5sheepimmuneamountSum}</#if></td>
                <td n="bruM5niuimmuneamount_ljSum" class="c2"><#if bruM5niuimmuneamount_ljSum??>${bruM5niuimmuneamount_ljSum}</#if></td>
                <td n="bruM5sheepimmuneamount_ljSum" class="c2"><#if bruM5sheepimmuneamount_ljSum??>${bruM5sheepimmuneamount_ljSum}</#if></td>

                <td n="immuneBruniu_ljSum" class="c2"><#if immuneBruniu_ljSum??>${immuneBruniu_ljSum}</#if></td>
                <td n="immuneBruSheep_ljSum" class="c2"><#if immuneBruSheep_ljSum??>${immuneBruSheep_ljSum}</#if></td>
                <td  class="c2"><#if (immuneBruniu_ljSum>0)>${(bruS2niuimmuneamount_ljSum?default(0)+bruM5niuimmuneamount_ljSum?default(0)+bruA19niuimmuneamount_ljSum?default(0))*100/immuneBruniu_ljSum}%</#if></td>
                <td  class="c2"><#if (immuneBruSheep_ljSum>0)>${(bruS2sheepimmuneamount_ljSum?default(0)+bruM5sheepimmuneamount_ljSum?default(0)+bruA19sheepimmuneamount_ljSum?default(0))*100/immuneBruSheep_ljSum}%</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
