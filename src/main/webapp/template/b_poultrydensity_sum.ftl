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
	height: 16.5pt;
}

.r3 {
	height: 28.5pt;
}

.r4 {
	height: 40.5pt;
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
			<col width="66">
			<col width="65">
			<col width="66">
			<col width="64">
			<col width="63">
			<col width="61">
			<col width="60">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="17">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
				<td class="c2" colspan="5">鸡</td>
				<td class="c2" colspan="3">鸭</td>
				<td class="c2" colspan="3">鹅</td>
				<td class="c2" colspan="5">其它</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" colspan="2">新城疫</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" rowspan="2">存栏数量（万羽）</td>
				<td class="c2" colspan="2">高致病性禽流感</td>
				<td class="c2" colspan="2">新城疫</td>
			</tr>
			<tr class="r4">
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
				<td class="c2">应免数量（万羽）</td>
				<td class="c2">实际免疫数量（万羽）</td>
			</tr>
			 <#list items as item>
			<tr class="r2">
				<td n="pdRegionname"  class="c2"><#if item.pdRegionname??>${item.pdRegionname}</#if></td>
				
				<td n="pdChickenherdscount"  class="c2"><#if item.pdChickenherdscount??>${item.pdChickenherdscount}</#if></td>
				<td n="pdChickenashuldcount"  class="c2"><#if item.pdChickenashuldcount??>${item.pdChickenashuldcount}</#if></td>
				<td n="pdChickenaactualcount"  class="c2"><#if item.pdChickenaactualcount??>${item.pdChickenaactualcount}</#if></td>
				<td n="pdChickennshuldcount"  class="c2"><#if item.pdChickennshuldcount??>${item.pdChickennshuldcount}</#if></td>
				<td n="pdChickennactualcount"  class="c2"><#if item.pdChickennactualcount??>${item.pdChickennactualcount}</#if></td>
				
				<td n="pdDuckherdscount"  class="c2"><#if item.pdDuckherdscount??>${item.pdDuckherdscount}</#if></td>
				<td n="pdDuckshuldcount"  class="c2"><#if item.pdDuckshuldcount??>${item.pdDuckshuldcount}</#if></td>
				<td n="pdDuckactualcount"  class="c2"><#if item.pdDuckactualcount??>${item.pdDuckactualcount}</#if></td>
			
				<td n="pdGooseherdscount"  class="c2"><#if item.pdGooseherdscount??>${item.pdGooseherdscount}</#if></td>
				<td n="pdGooseshuldcount"  class="c2"><#if item.pdGooseshuldcount??>${item.pdGooseshuldcount}</#if></td>
				<td n="pdGooseactualcount"  class="c2"><#if item.pdGooseactualcount??>${item.pdGooseactualcount}</#if></td>
				
				<td n="pdOtherherdscount"  class="c2"><#if item.pdOtherherdscount??>${item.pdOtherherdscount}</#if></td>
				<td n="pdOtherashuldcount"  class="c2"><#if item.pdOtherashuldcount??>${item.pdOtherashuldcount}</#if></td>
				<td n="pdOtheraactualcount"  class="c2"><#if item.pdOtheraactualcount??>${item.pdOtheraactualcount}</#if></td>
				<td n="pdOtherniashuldcount"  class="c2"><#if item.pdOtherniashuldcount??>${item.pdOtherniashuldcount}</#if></td>
                <td n="pdOtherniactualcount"  class="c2"><#if item.pdOtherniactualcount>${item.pdOtherniactualcount}</#if></td>
			</tr>
 </#list>
		</tbody>
	</table>
</body>
</html>
