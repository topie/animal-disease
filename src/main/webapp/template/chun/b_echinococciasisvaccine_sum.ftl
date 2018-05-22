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
	height: 24.75pt;
}

.r2 {
	height: 22.5pt;
}

.r3 {
	height: 18.0pt;
}

.r4 {
	height: 40.5pt;
}

.r5 {
	height: 19.5pt;
}

.r6 {
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

.c3 {
	white-space: pre-wrap;
	text-align: left;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="66">
			<col width="107">
			<col width="104">
			<col width="104">
			<col width="106">
			<col width="106">
			<col width="104">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="11">${templateName}统计表</td>
			</tr>
            <tr class="r2">
                <td class="c2" rowspan="3">省份</td>
                <td class="c2" colspan="3">包虫病疫苗</td>
                <td class="c2" colspan="7">包虫病驱虫药</td>
            </tr>
            <tr class="r3">
                <td class="c2">使用数量</td>
                <td class="c2">目前库存数量</td>
                <td class="c2">上半年使用数量</td>
                <td class="c2" colspan="2">使用数量</td>
                <td class="c2" colspan="2">目前库存数量</td>
                <td class="c2" colspan="2">上半年使用数量</td>
                <td class="c2" rowspan="2">驱虫犬只数量（万只）</td>
            </tr>
            <tr class="r3">
                <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
                <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
                <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
                <td class="c2">吡喹酮咀嚼片（万头份）</td>
                <td class="c2">其他（万头份）</td>
                <td class="c2">吡喹酮咀嚼片（万头份）</td>
                <td class="c2">其他（万头份）</td>
                <td class="c2">吡喹酮咀嚼片（万头份）</td>
                <td class="c2">其他（万头份）</td>
            </tr>
			<#assign echVaccineusecountSum=0>
			<#assign echVaccinestorecountSum=0>
			<#assign echVaccineyearcountSum=0>
			<#assign echAnthelminticusecountSum=0>
			<#assign echAnthelminticotherusecountSum=0>
			<#assign echAnthelminticstorecountSum=0>
			<#assign echAnthelminticothestorecountSum=0>
			<#assign echAnthelminticyearcountSum=0>
			<#assign echAnthelminticotheyearcountSum=0>
			<#assign echImmunedogcountSum=0>
			<#list items as item>
				<#assign echVaccineusecountSum=echVaccineusecountSum?default(0) +item.echVaccineusecount?default(0)>
				<#assign echVaccinestorecountSum=echVaccinestorecountSum?default(0) +item.echVaccinestorecount?default(0)>
				<#assign echVaccineyearcountSum=echVaccineyearcountSum?default(0) +item.echVaccineyearcount?default(0)>
				<#assign echAnthelminticusecountSum=echAnthelminticusecountSum?default(0) +item.echAnthelminticusecount?default(0)>
				<#assign echAnthelminticotherusecountSum=echAnthelminticotherusecountSum?default(0) +item.echAnthelminticotherusecount?default(0)>
				<#assign echAnthelminticstorecountSum=echAnthelminticstorecountSum?default(0) +item.echAnthelminticstorecount?default(0)>
				<#assign echAnthelminticothestorecountSum=echAnthelminticothestorecountSum?default(0) +item.echAnthelminticothestorecount?default(0)>
				<#assign echAnthelminticyearcountSum=echAnthelminticyearcountSum?default(0) +item.echAnthelminticyearcount?default(0)>
				<#assign echAnthelminticotheyearcountSum=echAnthelminticotheyearcountSum?default(0) +item.echAnthelminticotheyearcount?default(0)>
				<#assign echImmunedogcountSum=echImmunedogcountSum?default(0) +item.echImmunedogcount?default(0)>
			<tr class="r5">
				<td n="echRegionname" class="c2"><#if item.echRegionname??>${item.echRegionname}</#if></td>
				<td n="echVaccineusecount"  class="c2"><#if item.echVaccineusecount??>${item.echVaccineusecount}</#if></td>
				<td n="echVaccinestorecount"  class="c2"><#if item.echVaccinestorecount??>${item.echVaccinestorecount}</#if></td>
				<td n="echVaccineyearcount"  class="c2"><#if item.echVaccineyearcount??>${item.echVaccineyearcount}</#if></td>
				<td n="echAnthelminticusecount"  class="c2"><#if item.echAnthelminticusecount??>${item.echAnthelminticusecount}</#if></td>
				<td n="echAnthelminticotherusecount"  class="c2"><#if item.echAnthelminticotherusecount??>${item.echAnthelminticotherusecount}</#if></td>
				<td n="echAnthelminticstorecount"  class="c2"><#if item.echAnthelminticstorecount??>${item.echAnthelminticstorecount}</#if></td>
                <td n="echAnthelminticothestorecount"  class="c2"><#if item.echAnthelminticothestorecount??>${item.echAnthelminticothestorecount}</#if></td>
                <td n="echAnthelminticyearcount"  class="c2"><#if item.echAnthelminticyearcount??>${item.echAnthelminticyearcount}</#if></td>
                <td n="echAnthelminticotheyearcount"  class="c2"><#if item.echAnthelminticotheyearcount??>${item.echAnthelminticotheyearcount}</#if></td>
                <td n="echImmunedogcount"  class="c2"><#if item.echImmunedogcount??>${item.echImmunedogcount}</#if></td>
			</tr>
 </#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="echVaccineusecountSum" class="c2"><#if echVaccineusecountSum??>${echVaccineusecountSum}</#if></td>
               <td n="echVaccinestorecountSum" class="c2"><#if echVaccinestorecountSum??>${echVaccinestorecountSum}</#if></td>
               <td n="echVaccineyearcountSum" class="c2"><#if echVaccineyearcountSum??>${echVaccineyearcountSum}</#if></td>
               <td n="echAnthelminticusecountSum" class="c2"><#if echAnthelminticusecountSum??>${echAnthelminticusecountSum}</#if></td>
               <td n="echAnthelminticotherusecountSum" class="c2"><#if echAnthelminticotherusecountSum??>${echAnthelminticotherusecountSum}</#if></td>
               <td n="echAnthelminticstorecountSum" class="c2"><#if echAnthelminticstorecountSum??>${echAnthelminticstorecountSum}</#if></td>
                <td n="echAnthelminticothestorecountSum" class="c2"><#if echAnthelminticothestorecountSum??>${echAnthelminticothestorecountSum}</#if></td>
                <td n="echAnthelminticyearcountSum" class="c2"><#if echAnthelminticyearcountSum??>${echAnthelminticyearcountSum}</#if></td>
                <td n="echAnthelminticotheyearcountSum" class="c2"><#if echAnthelminticotheyearcountSum??>${echAnthelminticotheyearcountSum}</#if></td>
                <td n="echImmunedogcountSum" class="c2"><#if echImmunedogcountSum??>${echImmunedogcountSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
