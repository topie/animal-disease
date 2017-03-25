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
	height: 21.0pt;
}

.r4 {
	height: 19.5pt;
}

.r5 {
	height: 15.0pt;
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
			<col width="112">
			<col width="82">
			<col width="81">
			<col width="61">
			<col width="63">
			<col width="60">
			<col width="72">
			<col width="67">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="85">
			<col width="82">
			<col width="52">
			<col width="66">
			<col width="58">
			<col width="65">
			<col width="66">
			<col width="66">
			<col width="66">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="21">禽流感免疫情况月报表 （2017年1月）</td>
			</tr>
			<tr class="r2">
				<td class="c2" rowspan="3">省份</td>
				<td class="c2" colspan="10">高致病性禽流感灭活疫苗</td>
				<td class="c2" colspan="10">禽流感-新城疫重组二联活疫苗</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">本月疫苗使用量（万毫升）</td>
				<td class="c2" rowspan="2">累计疫苗使用量（万毫升）</td>
				<td class="c2" colspan="4">本月免疫数量（万羽）</td>
				<td class="c2" colspan="4">累计免疫数量（万羽）</td>
				<td class="c2" rowspan="2">本月疫苗使用量（万羽份）</td>
				<td class="c2" rowspan="2">累计疫苗使用量（万羽份）</td>
				<td class="c2" colspan="4">本月免疫数量（万毫升）</td>
				<td class="c2" colspan="4">累计免疫数量（万毫升）</td>
			</tr>
			<tr class="r4">
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
			</tr>
			<#list items as item>
				<tr class="r5">
					<td class="c2"><#if item.aiRegionname??>${item.aiRegionname}</#if></td>
					<td n="aiInactivatedvaccine"  class="c2"><#if item.aiInactivatedvaccine??>${item.aiInactivatedvaccine}</#if></td>
					<td n=""  class="c2"></td>
					<td n="aiInactivatedimmuneamountchicken"  class="c2"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken}</#if></td>
					<td n="aiInactivatedimmuneamountduck"  class="c2"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck}</#if></td>
					<td n="aiInactivatedimmuneamountgoose"  class="c2"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose}</#if></td>
					<td n="aiInactivatedimmuneamountother"  class="c2"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother}</#if></td>
					
					<td n="aiInactivatedshouldamountchicken"  class="c2"><#if item.aiInactivatedshouldamountchicken??>${item.aiInactivatedshouldamountchicken}</#if></td>
					<td n="aiInactivatedshouldamountduck"  class="c2"><#if item.aiInactivatedshouldamountduck??>${item.aiInactivatedshouldamountduck}</#if></td>
					<td n="aiInactivatedshouldamountgoose"  class="c2"><#if item.aiInactivatedshouldamountgoose??>${item.aiInactivatedshouldamountgoose}</#if></td>
					<td n="aiInactivatedshouldamountother"  class="c2"><#if item.aiInactivatedshouldamountother??>${item.aiInactivatedshouldamountother}</#if></td>
					
					<td n="aiJointvaccine"  class="c2"><#if item.aiJointvaccine??>${item.aiJointvaccine}</#if></td>
					<td n="aiJointimmuneamountchicken"  class="c2"></td>
					<td n="aiJointimmuneamountchicken"  class="c2"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken}</#if></td>
					<td n="aiJointimmuneamountduck"  class="c2"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck}</#if></td>
					<td n="aiJointimmuneamountgoose"  class="c2"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose}</#if></td>
					<td n="aiJointimmuneamountother"  class="c2"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother}</#if></td>
					<td n="aiJointshouldamountchicken"  class="c2"><#if item.aiJointshouldamountchicken??>${item.aiJointshouldamountchicken}</#if></td>
					<td n="aiJointshouldamountduck"  class="c2"><#if item.aiJointshouldamountduck??>${item.aiJointshouldamountduck}</#if></td>
					<td n="aiJointshouldamountgoose"  class="c2"><#if item.aiJointshouldamountgoose??>${item.aiJointshouldamountgoose}</#if></td>
					<td n="aiJointshouldamountother"  class="c2"><#if item.aiJointshouldamountother??>${item.aiJointshouldamountother}</#if></td>
				</tr>
			</#list>
			
		</tbody>
	</table>
</body>
</html>
