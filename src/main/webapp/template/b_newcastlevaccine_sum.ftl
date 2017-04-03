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
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="66">
			<col width="100">
			<col width="89">
			<col width="92">
			<col width="85">
			<col width="83">
			<col width="83">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="7">新城疫疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="2">春/秋防使用数量</td>
				<td class="c2" colspan="2">目前库存数量</td>
				<td class="c2" colspan="2">全年使用数量</td>
			</tr>
			<tr class="r4">
				<td class="c2">新城疫灭活疫苗（万毫升）</td>
				<td class="c2">新城疫弱毒疫苗（万羽份）</td>
				<td class="c2">新城疫灭活疫苗（万毫升）</td>
				<td class="c2">新城疫弱毒疫苗（万羽份）</td>
				<td class="c2">新城疫灭活疫苗（万毫升）</td>
				<td class="c2">新城疫弱毒疫苗（万羽份）</td>
			</tr>
			<#assign nvInactivatedusecountSum=0>
			<#assign nvPoisonusecountSum=0>
			<#assign nvInactivatedstorecountSum=0>
			<#assign nvPoisonstorecountSum=0>
			<#assign nvInactivatedyearcountSum=0>
			<#assign nvPoisonyearcountSum=0>
<#list items as item>
	<#assign nvInactivatedusecountSum=nvInactivatedusecountSum?default(0) +item.nvInactivatedusecount?default(0)>
	<#assign nvPoisonusecountSum=nvPoisonusecountSum?default(0) +item.nvPoisonusecount?default(0)>
	<#assign nvInactivatedstorecountSum=nvInactivatedstorecountSum?default(0) +item.nvInactivatedstorecount?default(0)>
	<#assign nvPoisonstorecountSum=nvPoisonstorecountSum?default(0) +item.nvPoisonstorecount?default(0)>
	<#assign nvInactivatedyearcountSum=nvInactivatedyearcountSum?default(0) +item.nvInactivatedyearcount?default(0)>
	<#assign nvPoisonyearcountSum=nvPoisonyearcountSum?default(0) +item.nvPoisonyearcount?default(0)>
			<tr class="r5">
				<td n="nvRegionname" class="c2"><#if item.nvRegionname??>${item.nvRegionname}</#if></td>
				<td n="nvInactivatedusecount"   class="c2"><#if item.nvInactivatedusecount??>${item.nvInactivatedusecount}</#if></td>
				<td n="nvPoisonusecount"  class="c2"><#if item.nvPoisonusecount??>${item.nvPoisonusecount}</#if></td>
				<td n="nvInactivatedstorecount"  class="c2"><#if item.nvInactivatedstorecount??>${item.nvInactivatedstorecount}</#if></td>
				<td n="nvPoisonstorecount"  class="c2"><#if item.nvPoisonstorecount??>${item.nvPoisonstorecount}</#if></td>
				<td n="nvInactivatedyearcount"  class="c2"><#if item.nvInactivatedyearcount??>${item.nvInactivatedyearcount}</#if></td>
				<td n="nvPoisonyearcount"  class="c2"><#if item.nvPoisonyearcount??>${item.nvPoisonyearcount}</#if></td>
			</tr>
 </#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="nvInactivatedusecountSum" class="c2"><#if nvInactivatedusecountSum??>${nvInactivatedusecountSum}</#if></td>
                <td n="nvPoisonusecountSum" class="c2"><#if nvPoisonusecountSum??>${nvPoisonusecountSum}</#if></td>
                <td n="nvInactivatedstorecountSum" class="c2"><#if nvInactivatedstorecountSum??>${nvInactivatedstorecountSum}</#if></td>
                <td n="nvPoisonstorecountSum" class="c2"><#if nvPoisonstorecountSum??>${nvPoisonstorecountSum}</#if></td>
                <td n="nvInactivatedyearcountSum" class="c2"><#if nvInactivatedyearcountSum??>${nvInactivatedyearcountSum}</#if></td>
                <td n="nvPoisonyearcountSum" class="c2"><#if nvPoisonyearcountSum??>${nvPoisonyearcountSum}</#if></td>

            </tr>
		</tbody>
	</table>
</body>
</html>
