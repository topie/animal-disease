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
	height: 112.5pt;
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
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: right;
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
			<col width="100">
			<col width="66">
            <col width="66">
			
            <col width="66">
			<col width="66">
			<col width="66">
			
			<col width="66">
			<col width="66">
			<col width="66">
			
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="28">${templateName}统计表</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="28">禽流感疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">省份</td>
				<td class="c2" colspan="9">累计使用数量</td>
				<td class="c2" colspan="9">目前库存数量</td>
				<td class="c2" colspan="9">全年使用数量</td>
			</tr>
			<tr class="r4">
                <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
				<td class="c2">高致病性禽流感灭活疫苗（万毫升）</td>
				
				<td class="c3">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
                <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
				<td class="c2">高致病性禽流感灭活疫苗（万毫升））</td>
				
				<td class="c3">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
                <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
				<td class="c2">高致病性禽流感灭活疫苗（万毫升）</td>
				
				<td class="c3">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
			</tr>
			<#assign avH5H7UseCountSum=0>
			<#assign avMhUseCountSum=0>

			<#assign avRhrh5usecountSum=0>
			<#assign avH5H7StoreCountSum=0>
			<#assign avMhStoreCountSum=0>

			<#assign avRhrh5storecountSum=0>
			<#assign avH5H7YearCountSum=0>
			<#assign avMhYearCountSum=0>

			<#assign avRhrh5yearcountSum=0>
			<#list items as item>
				<#assign avH5H7UseCountSum=avH5H7UseCountSum?default(0) +item.avH5H7UseCount?default(0)>
				<#assign avMhUseCountSum=avMhUseCountSum?default(0) +item.avMhUseCount?default(0)>
				<#assign avRhrh5usecountSum=avRhrh5usecountSum?default(0) +item.avRhrh5usecount?default(0)>
				<#assign avH5H7StoreCountSum=avH5H7StoreCountSum?default(0) +item.avH5H7StoreCount?default(0)>
				<#assign avMhStoreCountSum=avMhStoreCountSum?default(0) +item.avMhStoreCount?default(0)>
				<#assign avRhrh5storecountSum=avRhrh5storecountSum?default(0) +item.avRhrh5storecount?default(0)>
				<#assign avH5H7YearCountSum=avH5H7YearCountSum?default(0) +item.avH5H7YearCount?default(0)>
				<#assign avMhYearCountSum=avMhYearCountSum?default(0) +item.avMhYearCount?default(0)>
				<#assign avRhrh5yearcountSum=avRhrh5yearcountSum?default(0) +item.avRhrh5yearcount?default(0)>
			<tr class="r5">
				<td n="avRegionname"  class="c2">${item.avRegionname}</td>
				<td n="avH5H7UseCount"  class="c2">${item.avH5H7UseCount?default(0)}</td>
				<td n="avMhUseCount"  class="c2"><#if item.avMhUseCount??>${item.avMhUseCount}</#if></td>
                <td n="avH5H7StoreCount"  class="c2">${item.avH5H7StoreCount?default(0)}</td>
				<td n="avMhStoreCount"  class="c2"><#if item.avMhStoreCount??>${item.avMhStoreCount}</#if></td>
				<td n="avRhrh5storecount"  class="c2"><#if item.avRhrh5storecount??>${item.avRhrh5storecount}</#if></td>
                <td n="avH5H7YearCount"  class="c2">${item.avH5H7YearCount?default(0)}</td>
				<td n="avMhYearCount"  class="c2"><#if item.avMhYearCount??>${item.avMhYearCount}</#if></td>
				<td n="avRhrh5yearcount"  class="c2"><#if item.avRhrh5yearcount??>${item.avRhrh5yearcount}</#if></td>
			</tr>
</#list>
            <tr class="r5">
                <td  class="c2">合计</td>
                <td n="avH5H7UseCountSum" class="c2"><#if avH5H7UseCountSum??>${avH5H7UseCountSum}</#if></td>
                <td n="avMhUseCountSum" class="c2"><#if avMhUseCountSum??>${avMhUseCountSum}</#if></td>
                <td n="avRhrh5usecountSum" class="c2"><#if avRhrh5usecountSum??>${avRhrh5usecountSum}</#if></td>
                <td n="avH5H7StoreCountSum" class="c2"><#if avH5H7StoreCountSum??>${avH5H7StoreCountSum}</#if></td>
                <td n="avMhStoreCountSum" class="c2"><#if avMhStoreCountSum??>${avMhStoreCountSum}</#if></td>
                <td n="avRhrh5storecountSum" class="c2"><#if avRhrh5storecountSum??>${avRhrh5storecountSum}</#if></td>
                <td n="avH5H7YearCountSum" class="c2"><#if avH5H7YearCountSum??>${avH5H7YearCountSum}</#if></td>
                <td n="avMhYearCountSum" class="c2"><#if avMhYearCountSum??>${avMhYearCountSum}</#if></td>
                <td n="avRhrh5yearcountSum" class="c2"><#if avRhrh5yearcountSum??>${avRhrh5yearcountSum}</#if></td>
            </tr>
		</tbody>
	</table>
</body>
</html>
