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
				<td class="c1" colspan="11">2016年春防高致病性猪蓝耳病疫苗使用和免疫情况周报表 （截止
					03月11日）</td>
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
				<td class="c2">春防累计疫苗使用数量(万毫升)</td>
				<td class="c2">本周免疫数量（万头）</td>
				<td class="c2">春防累计免疫数量(万头)</td>
				<td class="c2">本周疫苗使用数量（万头份）</td>
				<td class="c2">春防累计疫苗使用数量(万头份)</td>
				<td class="c2">本周免疫数量（万头）</td>
				<td class="c2">春防累计免疫数量(万头)</td>
			</tr>
			 <#list items as item>
			<tr class="r4">
				<td n="bedRegioncode"  class="c2"><#if item.bedRegioncode??>${item.bedRegioncode}</#if></td>
				
				<td n="bedInactivatedvaccine"  class="c2"><#if item.bedInactivatedvaccine??>${item.bedInactivatedvaccine?c}</#if></td>
				<td n=""  class="c2"></td>
				<td n="bedInactivatedimmuneamount"  class="c2"><#if item.bedInactivatedimmuneamount??>${item.bedInactivatedimmuneamount?c}</#if></td>
				<td n=""  class="c2"></td>
				
				<td n="bedWeakvaccine"  class="c2"><#if item.bedWeakvaccine??>${item.bedWeakvaccine?c}</#if></td>
				<td n=""  class="c2"></td>
				<td n="bedWeakimmuneamount"  class="c2"><#if item.bedWeakimmuneamount??>${item.bedWeakimmuneamount?c}</#if></td>
				<td n=""  class="c2"></td>
				
				<td n=""  class="c2"></td>
				<td n=""  class="c2"></td>
			</tr>
      </#list>
		</tbody>
	</table>
</body>
</html>
