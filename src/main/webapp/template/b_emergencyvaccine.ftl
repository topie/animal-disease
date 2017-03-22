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
	height: 15.0pt;
}

.r3 {
	height: 16.5pt;
}

.r4 {
	height: 13.5pt;
}

.r5 {
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
	text-align: center;
	color: black;
	font-size: 10pt;
}

.c5 {
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
			<col width="127">
			<col width="413">
			<col width="95">
			<col width="85">
			<col width="124">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="7">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位</td>
				<td class="c3" colspan="6">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期</td>
				<td class="c3" colspan="6"><#if item.evdate??>${item.evdate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人</td>
				<td class="c3" colspan="6">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c4">主管领导</td>
				<td class="c3" colspan="6">${user.leaderName}</td>
			</tr>
			<tr class="r2">
				<td class="c2" colspan="2">疫苗种类</td>
				<td class="c2">省级存储数量</td>
				<td class="c2">全省存储数量</td>
				<td class="c2" colspan="3">备注</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="6">口蹄疫疫苗</td>
				<td class="c3">口蹄疫o型灭活类疫苗（万毫升）</td>
				<td role="data" n="evFmoinactivated"   class="c2"><#if item.evFmoinactivated??>${item.evFmoinactivated?c}</#if></td>
				<td role="data" n="evAllfmoinactivated"   class="c2"><#if item.evAllfmoinactivated??>${item.evAllfmoinactivated?c}</#if></td>
				<td role="data" n=""   class="c2" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">口蹄疫o型合成肽疫苗（万毫升）</td>
				<td role="data" n="evFmosynthetic"   class="c2"><#if item.evFmosynthetic??>${item.evFmosynthetic?c}</#if></td>
				<td role="data" n="evAllfmosynthetic"   class="c2"><#if item.evAllfmosynthetic??>${item.evAllfmosynthetic?c}</#if></td>
				<td role="data" n=""   class="c2" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">口蹄疫o型-亚洲i型二价灭活疫苗（万毫升）</td>
				<td role="data" n="evFmosinactivated"   class="c2"><#if item.evFmosinactivated??>${item.evFmosinactivated?c}</#if></td>
				<td role="data" n="evAllfmosinactivated"   class="c2"><#if item.evAllfmosinactivated??>${item.evAllfmosinactivated?c}</#if></td>
				<td role="data" n=""   class="c2" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">口蹄疫o型-a型二价灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoas"   class="c2"><#if item.evFmoas??>${item.evFmoas?c}</#if></td>
				<td role="data" n="evAllfmoas"   class="c2"><#if item.evAllfmoas??>${item.evAllfmoas?c}</#if></td>
				<td role="data" n=""   class="c2" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">口蹄疫o型-a型-亚洲i型三价灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoaait"   class="c2"><#if item.evFmoaait??>${item.evFmoaait?c}</#if></td>
				<td role="data" n="evAllfmoaait"   class="c2"><#if item.evAllfmoaait??>${item.evAllfmoaait?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">口蹄疫a型灭活疫苗（万毫升）</td>
				<td role="data" n="evFmoa"   class="c2"><#if item.evFmoa??>${item.evFmoa?c}</#if></td>
				<td role="data" n="evAllfmoa"   class="c2"><#if item.evAllfmoa??>${item.evAllfmoa?c}</#if></td>
				<td role="data" n=""   class="c2" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="11">禽流感疫苗</td>
				<td class="c3">禽流感灭活疫苗（h5n1，re-4株）（万毫升）</td>
				<td role="data" n="evAih5n1re4"   class="c2"><#if item.evAih5n1re4??>${item.evAih5n1re4?c}</#if></td>
				<td role="data" n="evAllaih5n1re4"   class="c2"><#if item.evAllaih5n1re4??>${item.evAllaih5n1re4?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">禽流感灭活疫苗（h5n1，re-5株）（万毫升）</td>
				<td role="data" n="evAih5n1re5"   class="c2"><#if item.evAih5n1re5??>${item.evAih5n1re5?c}</#if></td>
				<td role="data" n="evAllaih5n1re5"   class="c2"><#if item.evAllaih5n1re5??>${item.evAllaih5n1re5?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">禽流感灭活疫苗（h5n1，re-5+re-4株）（万毫升）</td>
				<td role="data" n="evAih5n1re5re4"   class="c2"><#if item.evAih5n1re5re4??>${item.evAih5n1re5re4?c}</#if></td>
				<td role="data" n="evAllaih5n1re5re4"   class="c2"><#if item.evAllaih5n1re5re4??>${item.evAllaih5n1re5re4?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">h5-h9二价灭活疫苗（万毫升）</td>
				<td role="data" n="evAih5h9"   class="c2"><#if item.evAih5h9??>${item.evAih5h9?c}</#if></td>
				<td role="data" n="evAllaih5h9"   class="c2"><#if item.evAllaih5h9??>${item.evAllaih5h9?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">重组禽流感灭活疫苗（h5n1,re-6株）（万毫升）</td>
				<td role="data" n="evAih5n1re6"   class="c2"><#if item.evAih5n1re6??>${item.evAih5n1re6?c}</#if></td>
				<td role="data" n="evAllaih5n1re6"   class="c2"><#if item.evAllaih5n1re6??>${item.evAllaih5n1re6?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">重组禽流感灭活疫苗（h5n1,re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re7"   class="c2"><#if item.evAih5n1re7??>${item.evAih5n1re7?c}</#if></td>
				<td role="data" n="evAllaih5n1re7"   class="c2"><#if item.evAllaih5n1re7??>${item.evAllaih5n1re7?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r4">
				<td class="c3">重组禽流感病毒h5亚型二价灭活疫苗（h5n1,re-6+re-7株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7"   class="c2"><#if item.evAih5n1re6re7??>${item.evAih5n1re6re7?c}</#if></td>
				<td role="data" n="evAllaih5n1re6re7"   class="c2"><#if item.evAllaih5n1re6re7??>${item.evAllaih5n1re6re7?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">重组禽流感病毒h5亚型二价灭活疫苗（h5n1,re-6+re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re8"   class="c2"><#if item.evAih5n1re6re8??>${item.evAih5n1re6re8?c}</#if></td>
				<td role="data" n="evAllaih5n1re6re8"   class="c2"><#if item.evAllaih5n1re6re8??>${item.evAllaih5n1re6re8?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">重组禽流感病毒h5亚型三价灭活疫苗（h5n1,re-6+re-7株+re-8株）（万毫升）</td>
				<td role="data" n="evAih5n1re6re7re8"   class="c2"><#if item.evAih5n1re6re7re8??>${item.evAih5n1re6re7re8?c}</#if></td>
				<td role="data" n="evAllaih5n1re6re7re8"   class="c2"><#if item.evAllaih5n1re6re7re8??>${item.evAllaih5n1re6re7re8?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c3">禽流感灭活疫苗（h5n2亚型,d7株）</td>
				<td role="data" n="evAih5n2d7"   class="c2"><#if item.evAih5n2d7??>${item.evAih5n2d7?c}</#if></td>
				<td role="data" n="evAllaih5n2d7"   class="c2"><#if item.evAllaih5n2d7??>${item.evAllaih5n2d7?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r2">
				<td class="c5">禽流感-新城疫重组二联活疫苗（rl-h5-6株）（万羽份）</td>
				<td role="data" n="evAirlh5"   class="c2"><#if item.evAirlh5??>${item.evAirlh5?c}</#if></td>
				<td role="data" n="evAllairlh5"   class="c2"><#if item.evAllairlh5??>${item.evAllairlh5?c}</#if></td>
				<td role="data" n=""   class="c5" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">高致病性猪蓝耳病疫苗</td>
				<td class="c3">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
				<td role="data" n="evBe"   class="c2"><#if item.evBe??>${item.evBe?c}</#if></td>
				<td role="data" n="evAllbe"   class="c2"><#if item.evAllbe??>${item.evAllbe?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">高致病性猪蓝耳病活疫苗(万头份)</td>
				<td role="data" n="evBeinactivated"   class="c2"><#if item.evBeinactivated??>${item.evBeinactivated?c}</#if>td>
				<td role="data" n="evAllbeinactivated"   class="c2"><#if item.evAllbeinactivated??>${item.evAllbeinactivated?c}</#if>td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">猪瘟疫苗</td>
				<td class="c3">猪瘟活疫苗（万头份）</td>
				<td role="data" n="evCs"   class="c2"><#if item.evCs??>${item.evCs?c}</#if>td>
				<td role="data" n="evAllcs"   class="c2"><#if item.evAllcs??>${item.evAllcs?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">传代细胞源猪瘟活疫苗（万头份）</td>
				<td role="data" n="evCspassage"   class="c2"><#if item.evCspassage??>${item.evCspassage}</#if></td>
				<td role="data" n="evAllcspassage"   class="c2"><#if item.evAllcspassage??>${item.evAllcspassage?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">新城疫疫苗</td>
				<td class="c3">新城疫灭活疫苗（万毫升）</td>
				<td role="data" n="evNcinactivated"   class="c2"><#if item.evNcinactivated??>${item.evNcinactivated?c}</#if></td>
				<td role="data" n="evAllncinactivated"   class="c2"><#if item.evAllncinactivated??>${item.evAllncinactivated?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">新城疫弱毒疫苗（万羽份）</td>
				<td role="data" n="evNcweak"   class="c2"><#if item.evNcweak??>${item.evNcweak?c}</#if></td>
				<td role="data" n="evAllncweak"   class="c2"><#if item.evAllncweak??>${item.evAllncweak?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2">小反刍兽疫疫苗</td>
				<td class="c3">小反刍兽疫活疫苗（万头份）</td>
				<td role="data" n="evPdpr"   class="c2"><#if item.evPdpr??>${item.evPdpr?c}</#if></td>
				<td role="data" n="evAllpdpr"   class="c2"><#if item.evAllpdpr??>${item.evAllpdpr?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">布鲁氏菌病</td>
				<td class="c3">布鲁氏菌活疫苗（s2株）（万头份）</td>
				<td role="data" n="dfAlldrugs" class="c2"><#if item.dfAlldrugs??>${item.dfAlldrugs?c}</#if></td>
				<td role="data" n="dfAlldrugs"   class="c2"><#if item.dfAlldrugs??>${item.dfAlldrugs?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3">布鲁氏菌活疫苗（a19株）（万头份）</td>
				<td role="data" n="evBrucellas2"   class="c2"><#if item.evBrucellas2??>${item.evBrucellas2?c}</#if></td>
				<td role="data" n="evAllbrucellas2"   class="c2"><#if item.evAllbrucellas2??>${item.evAllbrucellas2?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
			<tr class="r5">
				<td>这是chinaexcel报表软件的试用版本，如有问题请联系www.chinaexcel.com。</td>
				<td class="c3">羊棘球蚴（包虫）病基因工程亚单位疫苗（万头份）</td>
				<td role="data" n="evSheephydatid"   class="c2"><#if item.evSheephydatid??>${item.evSheephydatid?c}</#if></td>
				<td role="data" n="evAllsheephydatid"   class="c2"><#if item.evAllsheephydatid??>${item.evAllsheephydatid?c}</#if></td>
				<td role="data" n=""   class="c3" colspan="3">&nbsp;</td>
			</tr>
		</tbody>
	</table>
</body>
</html>
