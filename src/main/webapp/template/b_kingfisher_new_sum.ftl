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
	height: 22.5pt;
}

.r2 {
	height: 32.25pt;
}

.r3 {
	height: 21.0pt;
}

.r4 {
	height: 24.0pt;
}

.r5 {
	height: 16.5pt;
}

.r6 {
	height: 22.0pt;
}

.c1 {
	white-space: pre-wrap;
	text-align: center;
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
			<col width="69">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="48">
			<col width="58">
			<col width="66">
			<col width="58">
			<col width="67">
			<col width="66">
			<col width="59">
			<col width="66">
			<col width="53">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="19">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
                <td class="c2" colspan="5">全省全年落实动物疫病防控经费（万元）</td>
                <td class="c2" colspan="5">全省秋防落实动物疫病防控经费（万元）</td>
                <td class="c2" colspan="5">省本级秋防落实动物疫病防控经费（万元）</td>
			</tr>
            <tr class="r3">
                <td class="c2" colspan="3">强制免疫补助经费</td>
                <td class="c2" rowspan="2">强制扑杀补助经费</td>
                <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
                <td class="c2" colspan="3">强制免疫补助经费</td>
                <td class="c2" rowspan="2">强制扑杀补助经费</td>
                <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
                <td class="c2" colspan="3">强制免疫补助经费</td>
                <td class="c2" rowspan="2">强制扑杀补助经费</td>
                <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
            </tr>
            <tr class="r4">
                <td class="c2">疫苗配套经费</td>
                <td class="c2">购买、实施动物防疫服务经费</td>
                <td class="c2">其它</td>
                <td class="c2">疫苗配套经费</td>
                <td class="c2">购买、实施动物防疫服务经费</td>
                <td class="c2">其它</td>
                <td class="c2">疫苗配套经费</td>
                <td class="c2">购买动物防疫服务经费</td>
                <td class="c2">其它</td>
            </tr>
		
			<#assign kfYearymptSum=0>
			<#assign kfYearfyfwSum=0>
			<#assign kfYearqzpsSum=0>
			<#assign kfYearwhhclSum=0>
			<#assign kfYearotherSum=0>

			<#assign kfAllshengymptSum=0>
			<#assign kfAllshengfyfwSum=0>
			<#assign kfAllshengotherSum=0>
			<#assign kfAllshengqzpsSum=0>
			<#assign kfAllshengwhhclSum=0>

			<#assign kfShengymptSum=0>
			<#assign kfShengfyfwSum=0>
			<#assign kfShengqzpsSum=0>
			<#assign kfShengwhhclSum=0>
			<#assign kfShengotherSum=0>

			<#list items as item>
				<#assign kfYearymptSum=kfYearymptSum?default(0) +item.kfYearympt?default(0)>
				<#assign kfYearfyfwSum=kfYearfyfwSum?default(0) +item.kfYearfyfw?default(0)>
				<#assign kfYearotherSum=kfYearotherSum?default(0) +item.kfYearother?default(0)>
				<#assign kfYearqzpsSum=kfYearqzpsSum?default(0) +item.kfYearqzps?default(0)>
				<#assign kfYearwhhclSum=kfYearwhhclSum?default(0) +item.kfYearwhhcl?default(0)>

				<#assign kfAllshengymptSum=kfAllshengymptSum?default(0) +item.kfAllshengympt?default(0)>
				<#assign kfAllshengfyfwSum=kfAllshengfyfwSum?default(0) +item.kfAllshengfyfw?default(0)>
				<#assign kfAllshengotherSum=kfAllshengotherSum?default(0) +item.kfAllshengother?default(0)>
				<#assign kfAllshengqzpsSum=kfAllshengqzpsSum?default(0) +item.kfAllshengqzps?default(0)>
				<#assign kfAllshengwhhclSum=kfAllshengwhhclSum?default(0) +item.kfAllshengwhhcl?default(0)>
			
				<#assign kfShengymptSum=kfShengymptSum?default(0) +item.kfShengympt?default(0)>
				<#assign kfShengfyfwSum=kfShengfyfwSum?default(0) +item.kfShengfyfw?default(0)>
				<#assign kfShengotherSum=kfShengotherSum?default(0) +item.kfShengother?default(0)>
				<#assign kfShengqzpsSum=kfShengqzpsSum?default(0) +item.kfShengqzps?default(0)>
				<#assign kfShengwhhclSum=kfShengwhhclSum?default(0) +item.kfShengwhhcl?default(0)>

			<tr class="r5">
				<td n="kfRegionname" class="c2"><#if item.kfRegionname??>${item.kfRegionname}</#if></td>
				<td n="kfYearympt"  class="c2"><#if item.kfYearympt??>${item.kfYearympt}</#if></td>
				<td n="kfYearfyfw"  class="c2"><#if item.kfYearfyfw??>${item.kfYearfyfw}</#if></td>
                <td n="kfYearother"   class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
                <td n="kfYearqzps"   class="c2"><#if item.kfYearqzps??>${item.kfAllshengfyfw}</#if></td>
                <td n="kfYearwhhcl"   class="c2"><#if item.kfYearwhhcl??>${item.kfYearwhhcl}</#if></td>

                <td n="kfAllshengympt"  class="c2"><#if item.kfAllshengympt??>${item.kfAllshengympt}</#if></td>
                <td n="kfAllshengfyfw"  class="c2"><#if item.kfAllshengfyfw??>${item.kfAllshengfyfw}</#if></td>
				<td n="kfAllshengother"  class="c2"><#if item.kfAllshengother??>${item.kfAllshengother}</#if></td>
				<td n="kfAllshengqzps"  class="c2"><#if item.kfAllshengqzps??>${item.kfAllshengqzps}</#if></td>
				<td n="kfAllshengwhhcl"  class="c2"><#if item.kfAllshengwhhcl??>${item.kfAllshengwhhcl}</#if></td>

				<td n="kfShengympt"  class="c2"><#if item.kfShengympt??>${item.kfShengympt}</#if></td>
				<td n="kfShengfyfw"  class="c2"><#if item.kfShengfyfw??>${item.kfShengfyfw}</#if></td>
				<td n="kfShengother"  class="c2"><#if item.kfShengother??>${item.kfShengother}</#if></td>
				<td n="kfShengqzps"  class="c2"><#if item.kfShengqzps??>${item.kfShengqzps}</#if></td>
				<td n="kfShengwhhcl"  class="c2"><#if item.kfShengwhhcl??>${item.kfShengwhhcl}</#if></td>
				
			</tr>
</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="kfYearymptSum" class="c2"><#if kfYearymptSum??>${kfYearymptSum}</#if></td>
                <td n="kfYearfyfwSum" class="c2"><#if kfYearfyfwSum??>${kfYearfyfwSum}</#if></td>
                <td n="kfYearotherSum"   class="c2"><#if kfYearotherSum??>${kfYearotherSum}</#if></td>
                <td n="kfYearqzpsSum"   class="c2"><#if kfYearqzpsSum??>${kfYearqzpsSum}</#if></td>
                <td n="kfYearwhhclSum"   class="c2"><#if kfYearwhhclSum??>${kfYearwhhclSum}</#if></td>

                <td n="kfAllshengymptSum" class="c2"><#if kfAllshengymptSum??>${kfAllshengymptSum}</#if></td>
                <td n="kfAllshengfyfwSum" class="c2"><#if kfAllshengfyfwSum??>${kfAllshengfyfwSum}</#if></td>
                <td n="kfAllshengotherSum" class="c2"><#if kfAllshengotherSum??>${kfAllshengotherSum}</#if></td>
                <td n="kfAllshengqzpsSum" class="c2"><#if kfAllshengqzpsSum??>${kfAllshengqzpsSum}</#if></td>
                <td n="kfAllshengwhhclSum" class="c2"><#if kfAllshengwhhclSum??>${kfAllshengwhhclSum}</#if></td>

                <td n="kfShengymptSum" class="c2"><#if kfShengymptSum??>${kfShengymptSum}</#if></td>
                <td n="kfShengfyfwSum" class="c2"><#if kfShengfyfwSum??>${kfShengfyfwSum}</#if></td>
                <td n="kfShengotherSum" class="c2"><#if kfShengotherSum??>${kfShengotherSum}</#if></td>
                <td n="kfShengqzpsSum" class="c2"><#if kfShengqzpsSum??>${kfShengqzpsSum}</#if></td>
                <td n="kfShengwhhclSum" class="c2"><#if kfShengwhhclSum??>${kfShengwhhclSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
