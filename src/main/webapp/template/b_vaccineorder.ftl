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
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c3">单 位:</td>
				<td class="c2" colspan="6">${org.orgName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c3">填表日期:</td>
				<td class="c2" colspan="6"><#if item.date??>${item.date?string("yyyy-MM-dd")}</#if></td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c3">填 表 人:</td>
				<td class="c2" colspan="6">${user.realName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c4">主管领导：</td>
				<td class="c2" colspan="6">${user.leaderName}</td>
				<td class="c2">&nbsp;</td>
				<td class="c2">&nbsp;</td>
			</tr>
			<tr class="r1">
				<td class="c3" colspan="2">疫苗种类</td>
				<td class="c3">本月到货</td>
				<td class="c3">累计到货</td>
				<td class="c3">本月下拨</td>
				<td class="c3">累计下拨</td>
				<td class="c3">备注</td>
				<td class="c2">累计到货</td>
				<td class="c2">累计下拨</td>
			</tr>
			<tr class="r1">
				<td class="c5" rowspan="6">口蹄疫</td>
				<td class="c2">口蹄疫O型灭活类疫苗(万毫升)</td>
				<td role="data" n="evFmoinactivateddh"  class="c3"><#if item.evFmoinactivateddh??>${item.evFmoinactivateddh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmoinactivatedx"   class="c3"><#if item.evFmoinactivatedx??>${item.evFmoinactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2"></td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">口蹄疫O型合成肽疫苗（万毫升）</td>
				<td role="data" n="evFmosyntheticdh"   class="c3"><#if item.evFmosyntheticdh??>${item.evFmosyntheticdh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmoinactivatedx"   class="c3"><#if item.evFmoinactivatedx??>${item.evFmoinactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">口蹄疫O型-亚洲I型二价灭活疫苗(万毫升)</td>
				<td role="data" n="evFmoinactivateddh"   class="c3"><#if item.evFmoinactivateddh??>${item.evFmoinactivateddh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmoinactivatedx"   class="c3"><#if item.evFmoinactivatedx??>${item.evFmoinactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c8">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoasdh"   class="c9"><#if item.evFmoasdh??>${item.evFmoasdh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmoasx"   class="c9"><#if item.evFmoasx??>${item.evFmoasx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c8">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c10">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
				<td  role="data" n="evFmo3inactivateddh"  class="c5"><#if item.evFmo3inactivateddh??>${item.evFmo3inactivateddh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmo3inactivatedx"   class="c5"><#if item.evFmo3inactivatedx??>${item.evFmo3inactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c11">口蹄疫A型灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoadh"   class="c12"><#if item.evFmoadh??>${item.evFmoadh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evFmoax"   class="c12"><#if item.evFmoax??>${item.evFmoax}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c11">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c3" rowspan="11">禽流感</td>
				<td class="c2">禽流感灭活疫苗（H5N1，Re-4株）（万毫升）</td>
				<td role="data" n="evAih5n1re4dh"   class="c3"><#if item.evAih5n1re4dh??>${item.evAih5n1re4dh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evAih5n1re4x"   class="c3"><#if item.evAih5n1re4x??>${item.evAih5n1re4x}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">禽流感灭活疫苗（H5N1，Re-5株）（万毫升）</td>
				<td role="data" n="evAih5n1re5dh"   class="c3"><#if item.evAih5n1re5dh??>${item.evAih5n1re5dh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evAih5n1re5x"   class="c3"><#if item.evAih5n1re5x??>${item.evAih5n1re5x}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">禽流感灭活疫苗（H5N1，Re-5+Re-4株）（万毫升）</td>
				<td role="data" n="evAllaih5n1re5re4dh"   class="c3"><#if item.evAllaih5n1re5re4dh??>${item.evAllaih5n1re5re4dh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evAllaih5n1re5re4x"   class="c3"><#if item.evAllaih5n1re5re4x??>${item.evAllaih5n1re5re4x}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c13">H5-H9二价灭活疫苗（万毫升）</td>
				<td role="data" n="evAih5h9dh"   class="c13"><#if item.evAih5h9dh??>${item.evAih5h9dh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evAih5h9x"   role="data"    class="c13"><#if item.evAih5h9x??>${item.evAih5h9x}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">重组禽流感灭活疫苗（H5N1,Re-6株）（万毫升）</td>
				<td role="data" n="evAih5n1re6dh"   class="c13"><#if item.evAih5n1re6dh??>${item.evAih5n1re6dh}</#if></td>
				<td role="data" n="evAllaih5n1re6dh"   class="c6"><#if item.evAllaih5n1re6dh??>${item.evAllaih5n1re6dh}</#if></td>
				<td role="data" n="evAih5n1re6x"   class="c13"><#if item.evAih5n1re6x??>${item.evAih5n1re6x}</#if></td>
				<td role="data" n="evAllaih5n1re6x"   class="c6"><#if item.evAllaih5n1re6x??>${item.evAllaih5n1re6x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td  class="c13">重组禽流感灭活疫苗（H5N1,Re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re7dh"   class="c13"><#if item.evAih5n1re7dh??>${item.evAih5n1re7dh}</#if></td>
				<td role="data" n="evAllaih5n1re7dh"   class="c6"><#if item.evAllaih5n1re7dh??>${item.evAllaih5n1re7dh}</#if></td>
				<td role="data" n="evAih5n1re7x"   class="c13"><#if item.evAih5n1re7x??>${item.evAih5n1re7x}</#if></td>
				<td role="data" n="evAllaih5n1re7x"   class="c6"><#if item.evAllaih5n1re7x??>${item.evAllaih5n1re7x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13">0</td>
				<td role="data" n=""   class="c13">0</td>
			</tr>
			<tr class="r1">
				<td class="c13">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7dh"   class="c13"><#if item.evAih5n1re6re7dh??>${item.evAih5n1re6re7dh}</#if></td>
				<td role="data" n="evAllaih5n1re6re7dh"   class="c6"><#if item.evAllaih5n1re6re7dh??>${item.evAllaih5n1re6re7dh}</#if></td>
				<td role="data" n="evAih5n1re6re7x"   class="c13"><#if item.evAih5n1re6re7x??>${item.evAih5n1re6re7x}</#if></td>
				<td role="data" n="evAllaih5n1re6re7x"   class="c6"><#if item.evAllaih5n1re6re7x??>${item.evAllaih5n1re6re7x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re8dh"   class="c13"><#if item.evAih5n1re6re8dh??>${item.evAih5n1re6re8dh}</#if></td>
				<td role="data" n=evAllaih5n1re6re8dh   class="c6"><#if item.evAllaih5n1re6re8dh??>${item.evAllaih5n1re6re8dh}</#if></td>
				<td role="data" n="evAih5n1re6re8x"   class="c13"><#if item.evAih5n1re6re8x??>${item.evAih5n1re6re8x}</#if></td>
				<td role="data" n="evAllaih5n1re6re8x"   class="c6"><#if item.evAllaih5n1re6re8x??>${item.evAllaih5n1re6re8x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13">0</td>
				<td role="data" n=""   class="c13">0</td>
			</tr>
			<tr class="r1">
				<td class="c13">重组禽流感病毒H5亚型三价灭活疫苗（H5N1,Re-6+Re-7株+Re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7re8dh"   class="c13"><#if item.evAih5n1re6re7re8dh??>${item.evAih5n1re6re7re8dh}</#if></td>
				<td role="data" n="evAllaih5n1re6re7re8dh"   class="c6"><#if item.evAllaih5n1re6re7re8dh??>${item.evAllaih5n1re6re7re8dh}</#if></td>
				<td role="data" n="evAih5n1re6re7re8x"   class="c13"><#if item.evAih5n1re6re7re8x??>${item.evAih5n1re6re7re8x}</#if></td>
				<td role="data" n="evAllaih5n1re6re7re8x"   class="c6"><#if item.evAllaih5n1re6re7re8x??>${item.evAllaih5n1re6re7re8x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">禽流感灭活疫苗（H5N2亚型，D7株）</td>
				<td role="data" n="evAih5n2d7dh"   class="c13"><#if item.evAih5n2d7dh??>${item.evAih5n2d7dh}</#if></td>
				<td role="data" n="evAllaih5n2d7dh"   class="c6"><#if item.evAllaih5n2d7dh??>${item.evAllaih5n2d7dh}</#if></td>
				<td role="data" n="evAih5n2d7x"   class="c13"><#if item.evAih5n2d7x??>${item.evAih5n2d7x}</#if></td>
				<td role="data" n="evAllaih5n2d7x"   class="c6"><#if item.evAllaih5n2d7x??>${item.evAllaih5n2d7x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c3" rowspan="2">高致病性猪蓝耳病疫苗</td>
				<td class="c2">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td role="data" n="evBedh"   class="c3"><#if item.evBedh??>${item.evBedh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evBex"   class="c3"><#if item.evBex??>${item.evBex}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td role="data" n="evBeinactivateddh"   class="c3"><#if item.evBeinactivateddh??>${item.evBeinactivateddh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evBeinactivatedx"   class="c3"><#if item.evBeinactivatedx??>${item.evBeinactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c3" rowspan="2">猪瘟疫苗</td>
				<td class="c2">猪瘟活疫苗(万头份)</td>
				<td role="data" n="evCsdh"   class="c3"><#if item.evCsdh??>${item.evCsdh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evCsx"   class="c3"><#if item.evCsx??>${item.evCsx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c2">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c7"></td>
			</tr>
			<tr class="r1">
				<td class="c2">传代细胞源猪瘟活疫苗（万头份）</td>
				<td role="data" n="evCspassagedh"   class="c3"><#if item.evCspassagedh??>${item.evCspassagedh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evCspassagex"   class="c3"><#if item.evCspassagex??>${item.evCspassagex}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c7"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13" rowspan="2">新城疫疫苗</td>
				<td class="c13">新城疫灭活疫苗(万毫升)</td>
				<td role="data" n="evNcinactivateddh"   class="c13"><#if item.evNcinactivateddh??>${item.evNcinactivateddh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evNcinactivatedx"   class="c13"><#if item.evNcinactivatedx??>${item.evNcinactivatedx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">新城疫弱毒疫苗(万羽份)</td>
				<td role="data" n="evNcweakdh"   class="c13"><#if item.evNcweakdh??>${item.evNcweakdh}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n="evNcweakx"   class="c13"><#if item.evNcweakx??>${item.evNcweakx}</#if></td>
				<td role="data" n=""   class="c6"></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">小反刍兽疫疫苗</td>
				<td class="c13">小反刍兽疫活疫苗（万头份）（万头份）</td>
				<td role="data" n="evPdprdh"   class="c13"><#if item.evPdprdh??>${item.evPdprdh}</#if></td>
				<td role="data" n="evAllpdprdh"   class="c6"><#if item.evAllpdprdh??>${item.evAllpdprdh}</#if></td>
				<td role="data" n="evPdprx"   class="c13"><#if item.evPdprx??>${item.evPdprx}</#if></td>
				<td role="data" n="evAllpdprx"   class="c6"><#if item.evAllpdprx??>${item.evAllpdprx}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13" rowspan="2">布鲁氏菌病</td>
				<td class="c13">布鲁氏菌活疫苗（S2株）（万头份）</td>
				<td role="data" n="evBrucellas2dh"   class="c13"><#if item.evBrucellas2dh??>${item.evBrucellas2dh}</#if></td>
				<td role="data" n="evAllbrucellas2dh"   class="c6"><#if item.evAllbrucellas2dh??>${item.evAllbrucellas2dh}</#if></td>
				<td role="data" n="evBrucellas2x"   class="c13"><#if item.evBrucellas2x??>${item.evBrucellas2x}</#if></td>
				<td role="data" n="evAllbrucellas2x"   class="c6"><#if item.evAllbrucellas2x??>${item.evAllbrucellas2x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">布鲁氏菌活疫苗（A19株）（万头份）</td>
				<td role="data" n="evBrucellaa19dh"   class="c13"><#if item.evBrucellaa19dh??>${item.evBrucellaa19dh}</#if></td>
				<td role="data" n="evAllbrucellaa19dh"   class="c6"><#if item.evAllbrucellaa19dh??>${item.evAllbrucellaa19dh}</#if></td>
				<td role="data" n="evBrucellaa19x"   class="c13"><#if item.evBrucellaa19x??>${item.evBrucellaa19x}</#if></td>
				<td role="data" n="evAllbrucellaa19x"   class="c6"><#if item.evAllbrucellaa19x??>${item.evAllbrucellaa19x}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r1">
				<td class="c13">棘球蚴病（包虫病）</td>
				<td class="c13">羊棘球蚴（包虫）病基因工程亚单位疫苗（万头份）</td>
				<td role="data" n="evSheephydatiddh"   class="c13"><#if item.evSheephydatiddh??>${item.evSheephydatiddh}</#if></td>
				<td role="data" n="evAllsheephydatiddh"   class="c6"><#if item.evAllsheephydatiddh??>${item.evAllsheephydatiddh}</#if></td>
				<td role="data" n="evSheephydatidx"   class="c13"><#if item.evSheephydatidx??>${item.evSheephydatidx}</#if></td>
				<td role="data" n="evAllsheephydatidx"   class="c6"><#if item.evAllsheephydatidx??>${item.evAllsheephydatidx}</#if></td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13"></td>
				<td role="data" n=""   class="c13"></td>
			</tr>
			<tr class="r2">
				<td class="c13">这是ChinaExcel报表软件的试用版本，如有问题请联系www.chinaexcel.com。</td>
				<td class="c13" colspan="6">如果某种疫苗的下拨数量大于到货数量请将原因填入相应的备注栏中，否则报表将无法提交。</td>
				<td role="data" n=""   class="c13">&nbsp;</td>
				<td role="data" n=""   class="c13">&nbsp;</td>
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
