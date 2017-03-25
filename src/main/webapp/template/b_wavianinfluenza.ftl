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
	height: 38.25pt;
}

.r5 {
	height: 21.95pt;
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
	text-align: center;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}

.c6 {
	white-space: pre-wrap;
	text-align: center;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c7 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c8 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
	border-bottom: thin solid black;
	border-left: thin solid black;
	color: black;
	font-size: 10pt;
}

.c9 {
	white-space: pre-wrap;
	text-align: center;
	background-color: #ff8080;
	border-top: thin solid black;
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}

.c10 {
	white-space: pre-wrap;
	text-align: right;
	color: black;
	font-size: 10pt;
}

.c11 {
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
			<col width="170">
			<col width="101">
			<col width="111">
			<col width="81">
			<col width="71">
			<col width="78">
			<col width="88">
			<col width="58">
			<col width="73">
			<col width="77">
			<col width="92">
			<col width="77">
			<col width="70">
			<col width="75">
			<col width="61">
			<col width="65">
			<col width="79">
			<col width="70">
			<col width="75">
			<col width="73">
			<col width="77">
			<col width="47">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
			<col width="19">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="22">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="21">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="21"><#if item.beddate??>${item.beddate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="21">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c4">主管领导：</td>
				<td class="c3" colspan="21">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">疫苗种类</td>
				<td class="c2" rowspan="2">本周疫苗使用数量(万毫升/万羽份)</td>
				<td class="c4" rowspan="2">秋防累计疫苗使用数量(万毫升/万羽份)</td>
				<td class="c2" colspan="4">本周免疫数量(万羽)</td>
				<td class="c2" colspan="5">秋防累计免疫数量(万羽)</td>
				<td class="c2" colspan="5">秋防应免数量(万羽)</td>
				<td class="c5" colspan="5">免疫进展(%)</td>
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
				<td class="c6">合计</td>
				<td class="c2">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">合计</td>
				<td class="c5">鸡</td>
				<td class="c2">鸭</td>
				<td class="c2">鹅</td>
				<td class="c2">其它禽</td>
				<td class="c2">合计</td>
			</tr>
			<tr class="r3">
				<td class="c2">高致病性禽流感灭活疫苗</td>
				<td role="data" n="aiInactivatedvaccine" class="c2"><#if item.aiInactivatedvaccine??>${item.aiInactivatedvaccine}</#if></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n="aiInactivatedimmuneamountchicken"  class="c2"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountduck"  class="c2"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountgoose"  class="c2"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountother"  class="c2"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother}</#if></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c8"></td>
				<td role="data" n=""  class="c7" rowspan="2"></td>
				<td role="data" n=""  class="c7" rowspan="2"></td>
				<td role="data" n=""  class="c7" rowspan="2"></td>
				<td role="data" n=""  class="c7" rowspan="2"></td>
				<td role="data" n=""  class="c7" rowspan="2"></td>
				<td role="data" n=""  class="c9" rowspan="2"></td>
				<td role="data" n=""  class="c9" rowspan="2"></td>
				<td role="data" n=""  class="c9" rowspan="2"></td>
				<td role="data" n=""  class="c9" rowspan="2"></td>
				<td role="data" n=""  class="c9" rowspan="2"></td>
	<!-- 			<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td>
				<td class="c10"></td> -->
			</tr>
			<tr class="r3">
				<td class="c3">禽流感-新城疫重组二联活疫苗</td>
				<td role="data" n="aiJointvaccine" class="c2"><#if item.aiJointvaccine??>${item.aiJointvaccine}</#if></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n="aiJointimmuneamountchicken"  class="c2"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken}</#if></td>
				<td role="data" n="aiJointimmuneamountduck"  class="c2"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck}</#if></td>
				<td role="data" n="aiJointimmuneamountgoose"  class="c2"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose}</#if></td>
				<td role="data" n="aiJointimmuneamountother"  class="c2"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother}</#if></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c7"></td>
				<td role="data" n=""  class="c8"></td>
		<!-- 		<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td>
				<td class="c10">0</td> -->
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="3">填报说明：</td>
				<td class="c3" colspan="21">1.本周免疫数量是指填报本周的免疫数量；</td>
				<td class="c11">&nbsp;</td>
			</tr>
			<tr class="r3">
				<td class="c3" colspan="21">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
			</tr>
			<tr class="r5">
				<td class="c3" colspan="21">3.&ldquo;高致病性禽流感灭活疫苗&rdquo;使用数量按毫升统计，&ldquo;禽流感-新城疫重组二联活疫苗&rdquo;使用数量按羽份统计。</td>
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
