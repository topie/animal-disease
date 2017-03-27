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
	height: 19.5pt;
}

.r2 {
	height: 21.95pt;
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
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c3 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c4 {
	white-space: pre-wrap;
	text-align: center;
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ffc0c0;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c7 {
	white-space: pre-wrap;
	text-align: right;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: left;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: left;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c11 {
	white-space: pre-wrap;
	text-align: left;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c12 {
	white-space: pre-wrap;
	text-align: center;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c13 {
	white-space: pre-wrap;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="129">
			<col width="412">
			<col width="110">
			<col width="110">
			<col width="110">
			<col width="110">
			<col width="91">
			<col width="92">
			<col width="64">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>

			</tr>
			<tr class="r1">
				<td class="c3">单 位:</td>
				<td class="c2" colspan="6">${org.orgName}</td>

			</tr>
			<tr class="r1">
				<td class="c3">填表日期:</td>
				<td class="c2" colspan="6"><#if item.date??>${item.date?string("yyyy-MM-dd")}</#if></td>

			</tr>
			<tr class="r1">
				<td class="c3">填 表 人:</td>
				<td class="c2" colspan="6">${user.realName}</td>

			</tr>
			<tr class="r1">
				<td class="c4">主管领导：</td>
				<td class="c2" colspan="6">${user.leaderName}</td>

			</tr>
			<tr class="r1">
				<td class="c3" colspan="2">疫苗种类</td>
				<td class="c3">本月到货</td>
				<td class="c3">累计到货</td>
				<td class="c3">本月下拨</td>
				<td class="c3">累计下拨</td>
				<td class="c3">备注</td>

			</tr>
			<tr class="r1">
				<td class="c5" rowspan="6">口蹄疫</td>
				<td class="c2">口蹄疫O型灭活类疫苗(万毫升)</td>
				<td role="data" n="evFmoinactivateddh"  class="c3"><#if item.evFmoinactivateddh??>${item.evFmoinactivateddh?c}</#if></td>
				<td  class="c6"><#if itemSum.evFmoinactivateddh??>${itemSum.evFmoinactivateddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmoinactivatedx"   class="c3"><#if item.evFmoinactivatedx??>${item.evFmoinactivatedx?c}</#if></td>
				<td class="c6"><#if itemSum.evFmoinactivatedx??>${itemSum.evFmoinactivatedx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td role="data" n="evFmosyntheticdh"   class="c3"><#if item.evFmosyntheticdh??>${item.evFmosyntheticdh?c}</#if></td>
				<td  class="c6"><#if itemSum.evFmosyntheticdh??>${itemSum.evFmosyntheticdh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmosyntheticx"   class="c3"><#if item.evFmosyntheticx??>${item.evFmosyntheticx?c}</#if></td>
				<td class="c6"><#if itemSum.evFmosyntheticx??>${itemSum.evFmosyntheticx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗(万毫升)</td>
				<td role="data" n="evFmosinactivateddh"   class="c3"><#if item.evFmosinactivateddh??>${item.evFmoinactivateddh?c}</#if></td>
				<td class="c6"><#if itemSum.evFmosinactivateddh??>${itemSum.evFmosinactivateddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmosinactivatedx"   class="c3"><#if item.evFmosinactivatedx??>${item.evFmoinactivatedx?c}</#if></td>
				<td class="c6"><#if itemSum.evFmosinactivatedx??>${itemSum.evFmosinactivatedx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c8">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoasdh"   class="c9"><#if item.evFmoasdh??>${item.evFmoasdh?c}</#if></td>
				<td class="c6"><#if itemSum.evFmoasdh??>${itemSum.evFmoasdh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmoasx"   class="c9"><#if item.evFmoasx??>${item.evFmoasx?c}</#if></td>
				<td  class="c6"><#if itemSum.evFmoasx??>${itemSum.evFmoasx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c8">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c10">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td  role="data" n="evFmo3inactivateddh"  class="c5"><#if item.evFmo3inactivateddh??>${item.evFmo3inactivateddh?c}</#if></td>
				<td class="c6"><#if itemSum.evFmo3inactivateddh??>${itemSum.evFmo3inactivateddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmo3inactivatedx"   class="c5"><#if item.evFmo3inactivatedx??>${item.evFmo3inactivatedx?c}</#if></td>
				<td class="c6"><#if itemSum.evFmo3inactivatedx??>${itemSum.evFmo3inactivatedx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<
			</tr>
			<tr class="r1">
				<td class="c11">口蹄疫A型灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoadh"   class="c12"><#if item.evFmoadh??>${item.evFmoadh?c}</#if></td>
				<td class="c6"><#if itemSum.evFmoadh??>${itemSum.evFmoadh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evFmoax"   class="c12"><#if item.evFmoax??>${item.evFmoax?c}</#if></td>
				<td class="c6"><#if itemSum.evFmoax??>${itemSum.evFmoax?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c11">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3" rowspan="11">禽流感</td>
				<td class="c2">禽流感灭活疫苗（H5N1，Re-4株）（万毫升）</td>
				<td role="data" n="evAih5n1re4dh"   class="c3"><#if item.evAih5n1re4dh??>${item.evAih5n1re4dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re4dh??>${itemSum.evAih5n1re4dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re4x"   class="c3"><#if item.evAih5n1re4x??>${item.evAih5n1re4x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re4x??>${itemSum.evAih5n1re4x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">禽流感灭活疫苗（H5N1，Re-5株）（万毫升）</td>
				<td role="data" n="evAih5n1re5dh"   class="c3"><#if item.evAih5n1re5dh??>${item.evAih5n1re5dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re5dh??>${itemSum.evAih5n1re5dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re5x"   class="c3"><#if item.evAih5n1re5x??>${item.evAih5n1re5x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re5x??>${itemSum.evAih5n1re5x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">禽流感灭活疫苗（H5N1，Re-5+Re-4株）（万毫升）</td>
				<td role="data" n="evAllaih5n1re5re4dh"   class="c3"><#if item.evAllaih5n1re5re4dh??>${item.evAllaih5n1re5re4dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAllaih5n1re5re4dh??>${itemSum.evAllaih5n1re5re4dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAllaih5n1re5re4x"   class="c3"><#if item.evAllaih5n1re5re4x??>${item.evAllaih5n1re5re4x?c}</#if></td>
				<td class="c6"><#if itemSum.evAllaih5n1re5re4x??>${itemSum.evAllaih5n1re5re4x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">H5-H9二价灭活疫苗（万毫升）</td>
				<td role="data" n="evAih5h9dh"   class="c3"><#if item.evAih5h9dh??>${item.evAih5h9dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5h9dh??>${itemSum.evAih5h9dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5h9x"   role="data"    class="c3"><#if item.evAih5h9x??>${item.evAih5h9x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5h9x??>${itemSum.evAih5h9x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">重组禽流感灭活疫苗（H5N1,Re-6株）（万毫升）</td>
				<td role="data" n="evAih5n1re6dh"   class="c3"><#if item.evAih5n1re6dh??>${item.evAih5n1re6dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6dh??>${itemSum.evAih5n1re6dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re6x"   class="c3"><#if item.evAih5n1re6x??>${item.evAih5n1re6x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6x??>${itemSum.evAih5n1re6x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td  class="c2">重组禽流感灭活疫苗（H5N1,Re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re7dh"   class="c3"><#if item.evAih5n1re7dh??>${item.evAih5n1re7dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re7dh??>${itemSum.evAih5n1re7dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re7x"   class="c3"><#if item.evAih5n1re7x??>${item.evAih5n1re7x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re7x??>${itemSum.evAih5n1re7x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7dh"   class="c3"><#if item.evAih5n1re6re7dh??>${item.evAih5n1re6re7dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re7dh??>${itemSum.evAih5n1re6re7dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re6re7x"   class="c3"><#if item.evAih5n1re6re7x??>${item.evAih5n1re6re7x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re7x??>${itemSum.evAih5n1re6re7x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re8dh"   class="c3"><#if item.evAih5n1re6re8dh??>${item.evAih5n1re6re8dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re8dh??>${itemSum.evAih5n1re6re8dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re6re8x"   class="c3"><#if item.evAih5n1re6re8x??>${item.evAih5n1re6re8x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re8x??>${itemSum.evAih5n1re6re8x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">重组禽流感病毒H5亚型三价灭活疫苗（H5N1,Re-6+Re-7株+Re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7re8dh"   class="c3"><#if item.evAih5n1re6re7re8dh??>${item.evAih5n1re6re7re8dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re7re8dh??>${itemSum.evAih5n1re6re7re8dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n1re6re7re8x"   class="c3"><#if item.evAih5n1re6re7re8x??>${item.evAih5n1re6re7re8x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n1re6re7re8x??>${itemSum.evAih5n1re6re7re8x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">禽流感灭活疫苗（H5N2亚型，D7株）</td>
				<td role="data" n="evAih5n2d7dh"   class="c3"><#if item.evAih5n2d7dh??>${item.evAih5n2d7dh?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n2d7dh??>${itemSum.evAih5n2d7dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAih5n2d7x"   class="c3"><#if item.evAih5n2d7x??>${item.evAih5n2d7x?c}</#if></td>
				<td class="c6"><#if itemSum.evAih5n2d7x??>${itemSum.evAih5n2d7x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
				<td role="data" n="evAirlh5dh"   class="c3"><#if item.evAirlh5dh??>${item.evAirlh5dh?string("0.##")}<#else>0.00</#if></td>
				<td class="c6"><#if itemSum.evAirlh5dh??>${itemSum.evAirlh5dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evAirlh5x"   class="c3"><#if item.evAirlh5x??>${item.evAirlh5x?string("0.##")}<#else>0.00</#if></td>
				<td class="c6"><#if itemSum.evAirlh5x??>${itemSum.evAirlh5x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3" rowspan="2">高致病性猪蓝耳病疫苗</td>
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td role="data" n="evBedh"   class="c3"><#if item.evBedh??>${item.evBedh?c}</#if></td>
				<td class="c6"><#if itemSum.evBedh??>${itemSum.evBedh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evBex"   class="c3"><#if item.evBex??>${item.evBex?c}</#if></td>
				<td class="c6"><#if itemSum.evBex??>${itemSum.evBex?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td role="data" n="evBeinactivateddh"   class="c3"><#if item.evBeinactivateddh??>${item.evBeinactivateddh?c}</#if></td>
				<td class="c6"><#if itemSum.evBeinactivateddh??>${itemSum.evBeinactivateddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evBeinactivatedx"   class="c3"><#if item.evBeinactivatedx??>${item.evBeinactivatedx?c}</#if></td>
				<td class="c6"><#if itemSum.evBeinactivatedx??>${itemSum.evBeinactivatedx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3" rowspan="2">猪瘟疫苗</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td role="data" n="evCsdh"   class="c3"><#if item.evCsdh??>${item.evCsdh?c}</#if></td>
				<td class="c6"><#if itemSum.evCsdh??>${itemSum.evCsdh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evCsx"   class="c3"><#if item.evCsx??>${item.evCsx?c}</#if></td>
				<td class="c6"><#if itemSum.evCsx??>${itemSum.evCsx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">传代细胞源猪瘟活疫苗（万头份）</td>
				<td role="data" n="evCspassagedh"   class="c3"><#if item.evCspassagedh??>${item.evCspassagedh?c}</#if></td>
				<td class="c6"><#if itemSum.evCspassagedh??>${itemSum.evCspassagedh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evCspassagex"   class="c3"><#if item.evCspassagex??>${item.evCspassagex?c}</#if></td>
				<td class="c6"><#if itemSum.evCspassagex??>${itemSum.evCspassagex?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2" rowspan="2">新城疫疫苗</td>
				<td class="c2">新城疫灭活疫苗(万毫升)</td>
				<td role="data" n="evNcinactivateddh"   class="c3"><#if item.evNcinactivateddh??>${item.evNcinactivateddh?c}</#if></td>
				<td class="c6"><#if itemSum.evNcinactivateddh??>${itemSum.evNcinactivateddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evNcinactivatedx"   class="c3"><#if item.evNcinactivatedx??>${item.evNcinactivatedx?c}</#if></td>
				<td class="c6"><#if itemSum.evNcinactivatedx??>${itemSum.evNcinactivatedx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c2">新城疫弱毒疫苗(万羽份)</td>
				<td role="data" n="evNcweakdh"   class="c3"><#if item.evNcweakdh??>${item.evNcweakdh?c}</#if></td>
				<td class="c6"><#if itemSum.evNcweakdh??>${itemSum.evNcweakdh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evNcweakx"   class="c3"><#if item.evNcweakx??>${item.evNcweakx?c}</#if></td>
				<td class="c6"><#if itemSum.evNcweakx??>${itemSum.evNcweakx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3">小反刍兽疫疫苗</td>
				<td class="c2">小反刍兽疫活疫苗（万头份）（万头份）</td>
				<td role="data" n="evPdprdh"   class="c3"><#if item.evPdprdh??>${item.evPdprdh?c}</#if></td>
				<td class="c6"><#if itemSum.evPdprdh??>${itemSum.evPdprdh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evPdprx"   class="c3"><#if item.evPdprx??>${item.evPdprx?c}</#if></td>
				<td class="c6"><#if itemSum.evPdprx??>${itemSum.evPdprx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3" rowspan="2">布鲁氏菌病</td>
				<td class="c2">布鲁氏菌活疫苗（S2株）（万头份）</td>
				<td role="data" n="evBrucellas2dh"   class="c3"><#if item.evBrucellas2dh??>${item.evBrucellas2dh?c}</#if></td>
				<td class="c6"><#if itemSum.evBrucellas2dh??>${itemSum.evBrucellas2dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evBrucellas2x"   class="c3"><#if item.evBrucellas2x??>${item.evBrucellas2x?c}</#if></td>
				<td class="c6"><#if itemSum.evBrucellas2x??>${itemSum.evBrucellas2x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c3">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c2">布鲁氏菌活疫苗（A19株）（万头份）</td>
				<td role="data" n="evBrucellaa19dh"   class="c3"><#if item.evBrucellaa19dh??>${item.evBrucellaa19dh?c}</#if></td>
				<td class="c6"><#if itemSum.evBrucellaa19dh??>${itemSum.evBrucellaa19dh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evBrucellaa19x"   class="c3"><#if item.evBrucellaa19x??>${item.evBrucellaa19x?c}</#if></td>
				<td class="c6"><#if itemSum.evBrucellaa19x??>${itemSum.evBrucellaa19x?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>

			</tr>
			<tr class="r1">
				<td class="c3">棘球蚴病（包虫病）</td>
				<td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗（万头份）</td>
				<td role="data" n="evSheephydatiddh"   class="c3"><#if item.evSheephydatiddh??>${item.evSheephydatiddh?c}</#if></td>
				<td class="c6"><#if itemSum.evSheephydatiddh??>${itemSum.evSheephydatiddh?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n="evSheephydatidx"   class="c3"><#if item.evSheephydatidx??>${item.evSheephydatidx?c}</#if></td>
				<td class="c6"><#if itemSum.evSheephydatidx??>${itemSum.evSheephydatidx?string("0.##")}<#else>0.00</#if></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
			</tr>

		</tbody>
	</table>
</body>
</html>
<#if report.status!=1>
<script type="text/javascript">
    (function ($, window, document, undefined) {
        $("td[role=data]").each(function (i, d) {
            var n = $(this).attr("n")
            $(this).off("click")
            $(this).on("click", function (e) {
                $("td[role=data]").each(function (e) {
                    $(this).attr("current", 0)
                })
                $(this).attr("current", 1)
                $("td[current=0]").find("input").each(function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                var oldText = $(this).text()
                $(this).empty()
                var input = $('<input style="height: 100%;width:100%;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus()
                e.stopPropagation()
            })
        })

        var calculate = function () {

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
