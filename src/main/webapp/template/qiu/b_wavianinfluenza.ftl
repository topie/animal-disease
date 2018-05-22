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
				<td class="c3" colspan="21"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r3">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="21">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="21">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">疫苗种类</td>
				<td class="c2" rowspan="2">本周疫苗使用数量(万毫升/万羽份)</td>
				<td class="c4" rowspan="2">累计疫苗使用数量(万毫升/万羽份)</td>
				<td class="c2" colspan="4">本周免疫数量(万羽)</td>
				<td class="c2" colspan="5">累计免疫数量(万羽)</td>
				<td class="c2" colspan="5">应免数量(万羽)</td>
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
				<td role="lj_aiInactivatedvaccine" class="c7"><#if itemSum.aiInactivatedvaccine??>${itemSum.aiInactivatedvaccine}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountchicken"  class="c2"><#if item.aiInactivatedimmuneamountchicken??>${item.aiInactivatedimmuneamountchicken}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountduck"  class="c2"><#if item.aiInactivatedimmuneamountduck??>${item.aiInactivatedimmuneamountduck}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountgoose"  class="c2"><#if item.aiInactivatedimmuneamountgoose??>${item.aiInactivatedimmuneamountgoose}</#if></td>
				<td role="data" n="aiInactivatedimmuneamountother"  class="c2"><#if item.aiInactivatedimmuneamountother??>${item.aiInactivatedimmuneamountother}</#if></td>
				<td role="lj_aiInactivatedimmuneamountchicken" class="c7"><#if itemSum.aiInactivatedimmuneamountchicken??>${itemSum.aiInactivatedimmuneamountchicken}</#if></td>
				<td role="lj_aiInactivatedimmuneamountduck" class="c7"><#if itemSum.aiInactivatedimmuneamountduck??>${itemSum.aiInactivatedimmuneamountduck}</#if></td>
				<td role="lj_aiInactivatedimmuneamountgoose" class="c7"><#if itemSum.aiInactivatedimmuneamountgoose??>${itemSum.aiInactivatedimmuneamountgoose}</#if></td>
				<td role="lj_aiInactivatedimmuneamountother" class="c7"><#if itemSum.aiInactivatedimmuneamountother??>${itemSum.aiInactivatedimmuneamountother}</#if></td>
				<td role="lj_sum1" class="c8"><#if itemSum??>${itemSum.aiInactivatedimmuneamountchicken+itemSum.aiInactivatedimmuneamountduck+itemSum.aiInactivatedimmuneamountgoose+itemSum.aiInactivatedimmuneamountother}</#if></td>
                <td  n="immunebirdfluchecken"  class="c7" rowspan="3"><#if wlivestockinout.immunebirdfluchecken??>${wlivestockinout.immunebirdfluchecken}</#if></td>
                <td  n="immunebirdfluduck"  class="c7" rowspan="3"><#if wlivestockinout.immunebirdfluduck??>${wlivestockinout.immunebirdfluduck}</#if></td>
                <td  n="immunebirdflugoose"  class="c7" rowspan="3"><#if wlivestockinout.immunebirdflugoose??>${wlivestockinout.immunebirdflugoose}</#if></td>
                <td  n="immunebirdfluother"  class="c7" rowspan="3"><#if wlivestockinout.immunebirdfluother??>${wlivestockinout.immunebirdfluother}</#if></td>
				<td  n="immunebirdSum"  class="c7" rowspan="3"><#if wlivestockinout??>${wlivestockinout.immunebirdfluchecken+wlivestockinout.immunebirdfluduck+wlivestockinout.immunebirdflugoose+wlivestockinout.immunebirdfluother}</#if></td>
				<td n="jz_immunebirdfluchecken" class="c9" rowspan="3">
				<#if (wlivestockinout.immunebirdfluchecken??&&wlivestockinout.immunebirdfluchecken>0)>${(itemSum.aiInactivatedimmuneamountchicken?default(0)+itemSum.aiJointimmuneamountchicken?default(0)+itemSum.aiH5H7ImmuneAmountChicken?default(0))*100/wlivestockinout.immunebirdfluchecken}%</#if>


				</td>
				<td n="jz_immunebirdfluduck" class="c9" rowspan="3">
				<#if (wlivestockinout.immunebirdfluduck??&&wlivestockinout.immunebirdfluduck>0)>${(itemSum.aiInactivatedimmuneamountduck?default(0)+itemSum.aiJointimmuneamountduck?default(0)+itemSum.aiH5H7ImmuneAmountDuck?default(0))*100/wlivestockinout.immunebirdfluduck}%</#if>

				</td>
				<td n="jz_immunebirdflugoose" class="c9" rowspan="3">
				<#if (wlivestockinout.immunebirdflugoose??&&wlivestockinout.immunebirdflugoose>0)>${(itemSum.aiInactivatedimmuneamountgoose?default(0)+itemSum.aiJointimmuneamountgoose?default(0)+itemSum.aiH5H7ImmuneAmountGoose?default(0))*100/wlivestockinout.immunebirdflugoose}%</#if>

				</td>
				<td n="jz_immunebirdfluother" class="c9" rowspan="3">
				<#if (wlivestockinout.immunebirdfluother??&&wlivestockinout.immunebirdfluother>0)>${(itemSum.aiInactivatedimmuneamountother?default(0)+itemSum.aiJointimmuneamountother?default(0)+itemSum.aiH5H7ImmuneAmountOther?default(0))*100/wlivestockinout.immunebirdfluother}%</#if>

				</td>
				<td n="jz_sum" class="c9" rowspan="3">
				<#if ((wlivestockinout.immunebirdfluchecken?default(0)+wlivestockinout.immunebirdfluduck?default(0)+wlivestockinout.immunebirdflugoose?default(0)+wlivestockinout.immunebirdfluother?default(0))>0)>
				${(itemSum.aiInactivatedimmuneamountchicken?default(0)+itemSum.aiJointimmuneamountchicken?default(0)+itemSum.aiH5H7ImmuneAmountChicken?default(0)+itemSum.aiInactivatedimmuneamountduck?default(0)+itemSum.aiJointimmuneamountduck?default(0)+itemSum.aiH5H7ImmuneAmountDuck?default(0)+itemSum.aiInactivatedimmuneamountgoose?default(0)+itemSum.aiJointimmuneamountgoose?default(0)+itemSum.aiH5H7ImmuneAmountGoose?default(0)+
				itemSum.aiInactivatedimmuneamountother?default(0)+itemSum.aiJointimmuneamountother?default(0)+itemSum.aiH5H7ImmuneAmountOther?default(0))*100/(wlivestockinout.immunebirdfluchecken?default(0)+wlivestockinout.immunebirdfluduck?default(0)+wlivestockinout.immunebirdflugoose?default(0)+wlivestockinout.immunebirdfluother?default(0))}%
				</#if>

				</td>
                <input id="aiInactivatedvaccine" type="hidden" value="${itemSum.aiInactivatedvaccine?default(0)-item.aiInactivatedvaccine?default(0)}"/>
                <input id="aiInactivatedimmuneamountchicken" type="hidden" value="${itemSum.aiInactivatedimmuneamountchicken?default(0)-item.aiInactivatedimmuneamountchicken?default(0)}"/>
                <input id="aiInactivatedimmuneamountduck" type="hidden" value="${itemSum.aiInactivatedimmuneamountduck?default(0)-item.aiInactivatedimmuneamountduck?default(0)}"/>
                <input id="aiInactivatedimmuneamountgoose" type="hidden" value="${itemSum.aiInactivatedimmuneamountgoose?default(0)-item.aiInactivatedimmuneamountgoose?default(0)}"/>
                <input id="aiInactivatedimmuneamountother" type="hidden" value="${itemSum.aiInactivatedimmuneamountother?default(0)-item.aiInactivatedimmuneamountother?default(0)}"/>

			</tr>
			<tr class="r3">
				<td class="c3">禽流感-新城疫重组二联活疫苗</td>
				<td role="data" n="aiJointvaccine" class="c2"><#if item.aiJointvaccine??>${item.aiJointvaccine}</#if></td>
				<td role="lj_aiJointvaccine" class="c7"><#if itemSum.aiJointvaccine??>${itemSum.aiJointvaccine}</#if></td>
				<td role="data" n="aiJointimmuneamountchicken"  class="c2"><#if item.aiJointimmuneamountchicken??>${item.aiJointimmuneamountchicken}</#if></td>
				<td role="data" n="aiJointimmuneamountduck"  class="c2"><#if item.aiJointimmuneamountduck??>${item.aiJointimmuneamountduck}</#if></td>
				<td role="data" n="aiJointimmuneamountgoose"  class="c2"><#if item.aiJointimmuneamountgoose??>${item.aiJointimmuneamountgoose}</#if></td>
				<td role="data" n="aiJointimmuneamountother"  class="c2"><#if item.aiJointimmuneamountother??>${item.aiJointimmuneamountother}</#if></td>
                <td role="lj_aiJointimmuneamountchicken" class="c7"><#if itemSum.aiJointimmuneamountchicken??>${itemSum.aiJointimmuneamountchicken}</#if></td>
                <td role="lj_aiJointimmuneamountduck" class="c7"><#if itemSum.aiJointimmuneamountduck??>${itemSum.aiJointimmuneamountduck}</#if></td>
                <td role="lj_aiJointimmuneamountgoose" class="c7"><#if itemSum.aiJointimmuneamountgoose??>${itemSum.aiJointimmuneamountgoose}</#if></td>
                <td role="lj_aiJointimmuneamountother" class="c7"><#if itemSum.aiJointimmuneamountother??>${itemSum.aiJointimmuneamountother}</#if></td>
				<td role="lj_sum2" class="c8"><#if itemSum??>${itemSum.aiJointimmuneamountchicken+itemSum.aiJointimmuneamountduck+itemSum.aiJointimmuneamountgoose+itemSum.aiJointimmuneamountother}</#if></td>
                <input id="aiJointvaccine" type="hidden" value="${itemSum.aiJointvaccine?default(0)-item.aiJointvaccine?default(0)}"/>
                <input id="aiJointimmuneamountchicken" type="hidden" value="${itemSum.aiJointimmuneamountchicken?default(0)-item.aiJointimmuneamountchicken?default(0)}"/>
                <input id="aiJointimmuneamountduck" type="hidden" value="${itemSum.aiJointimmuneamountduck?default(0)-item.aiJointimmuneamountduck?default(0)}"/>
                <input id="aiJointimmuneamountgoose" type="hidden" value="${itemSum.aiJointimmuneamountgoose?default(0)-item.aiJointimmuneamountgoose?default(0)}"/>
                <input id="aiJointimmuneamountother" type="hidden" value="${itemSum.aiJointimmuneamountother?default(0)-item.aiJointimmuneamountother?default(0)}"/>
			</tr>
            <tr class="r3">
                <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗</td>
                <td role="data" n="aiH5H7Vaccine" class="c2"><#if item.aiH5H7Vaccine??>${item.aiH5H7Vaccine}</#if></td>
                <td role="lj_aiH5H7Vaccine" class="c7"><#if itemSum.aiH5H7Vaccine??>${itemSum.aiH5H7Vaccine}</#if></td>
                <td role="data" n="aiH5H7ImmuneAmountChicken"  class="c2"><#if item.aiH5H7ImmuneAmountChicken??>${item.aiH5H7ImmuneAmountChicken}</#if></td>
                <td role="data" n="aiH5H7ImmuneAmountDuck"  class="c2"><#if item.aiH5H7ImmuneAmountDuck??>${item.aiH5H7ImmuneAmountDuck}</#if></td>
                <td role="data" n="aiH5H7ImmuneAmountGoose"  class="c2"><#if item.aiH5H7ImmuneAmountGoose??>${item.aiH5H7ImmuneAmountGoose}</#if></td>
                <td role="data" n="aiH5H7ImmuneAmountOther"  class="c2"><#if item.aiH5H7ImmuneAmountOther??>${item.aiH5H7ImmuneAmountOther}</#if></td>
                <td role="lj_aiH5H7ImmuneAmountChicken" class="c7"><#if itemSum.aiH5H7ImmuneAmountChicken??>${itemSum.aiH5H7ImmuneAmountChicken}</#if></td>
                <td role="lj_aiH5H7ImmuneAmountDuck" class="c7"><#if itemSum.aiH5H7ImmuneAmountDuck??>${itemSum.aiH5H7ImmuneAmountDuck}</#if></td>
                <td role="lj_aiH5H7ImmuneAmountGoose" class="c7"><#if itemSum.aiH5H7ImmuneAmountGoose??>${itemSum.aiH5H7ImmuneAmountGoose}</#if></td>
                <td role="lj_aiH5H7ImmuneAmountOther" class="c7"><#if itemSum.aiH5H7ImmuneAmountOther??>${itemSum.aiH5H7ImmuneAmountOther}</#if></td>
                <td role="lj_sum3" class="c8"><#if itemSum??>${itemSum.aiH5H7ImmuneAmountChicken+itemSum.aiH5H7ImmuneAmountDuck+itemSum.aiH5H7ImmuneAmountGoose+itemSum.aiH5H7ImmuneAmountOther}</#if></td>
                <input id="aiH5H7Vaccine" type="hidden" value="${itemSum.aiH5H7Vaccine?default(0)-item.aiH5H7Vaccine?default(0)}"/>
                <input id="aiH5H7ImmuneAmountChicken" type="hidden" value="${itemSum.aiH5H7ImmuneAmountChicken?default(0)-item.aiH5H7ImmuneAmountChicken?default(0)}"/>
                <input id="aiH5H7ImmuneAmountDuck" type="hidden" value="${itemSum.aiH5H7ImmuneAmountDuck?default(0)-item.aiH5H7ImmuneAmountDuck?default(0)}"/>
                <input id="aiH5H7ImmuneAmountGoose" type="hidden" value="${itemSum.aiH5H7ImmuneAmountGoose?default(0)-item.aiH5H7ImmuneAmountGoose?default(0)}"/>
                <input id="aiH5H7ImmuneAmountOther" type="hidden" value="${itemSum.aiH5H7ImmuneAmountOther?default(0)-item.aiH5H7ImmuneAmountOther?default(0)}"/>

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
				<td class="c3" colspan="21">3.&ldquo;高致病性禽流感灭活疫苗&rdquo;、&rdquo;重组禽流感病毒（H5+H7）二价灭活疫苗&rdquo;使用数量按毫升统计，&ldquo;禽流感-新城疫重组二联活疫苗&rdquo;使用数量按羽份统计。</td>
			</tr>
		</tbody>
	</table>
    <input type="hidden" id="valid"/>
    <input type="hidden" id="valid-msg"/>
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
                var input = $('<input style="height: 100%;width:100%;min-width:100px;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur", function (e) {
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                    calculate()
                })
                input.on("click", function (e) {
                    e.stopPropagation()
                })
                $(this).append(input);
                input.focus();input.select();
                e.stopPropagation()
            })
        })

        var calculate = function () {
            var aiInactivatedvaccine = $.trim($('td[n="aiInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedvaccine"]').text()));
            var aiInactivatedimmuneamountchicken = $.trim($('td[n="aiInactivatedimmuneamountchicken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountchicken"]').text()));
            var aiInactivatedimmuneamountduck = $.trim($('td[n="aiInactivatedimmuneamountduck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountduck"]').text()));
            var aiInactivatedimmuneamountgoose = $.trim($('td[n="aiInactivatedimmuneamountgoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountgoose"]').text()));
            var aiInactivatedimmuneamountother = $.trim($('td[n="aiInactivatedimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiInactivatedimmuneamountother"]').text()));
            var lj_aiInactivatedvaccine=document.getElementById('aiInactivatedvaccine').value;
            var lj_aiInactivatedimmuneamountchicken=document.getElementById('aiInactivatedimmuneamountchicken').value;
            var lj_aiInactivatedimmuneamountduck=document.getElementById('aiInactivatedimmuneamountduck').value;
            var lj_aiInactivatedimmuneamountgoose=document.getElementById('aiInactivatedimmuneamountgoose').value;
            var lj_aiInactivatedimmuneamountother=document.getElementById('aiInactivatedimmuneamountother').value;
            var lj_chicken1=(parseFloat(lj_aiInactivatedimmuneamountchicken)+parseFloat(aiInactivatedimmuneamountchicken)).toFixed(2);
            var lj_duck1=(parseFloat(lj_aiInactivatedimmuneamountduck)+parseFloat(aiInactivatedimmuneamountduck)).toFixed(2);
            var lj_goose1=(parseFloat(lj_aiInactivatedimmuneamountgoose)+parseFloat(aiInactivatedimmuneamountgoose)).toFixed(2);
            var lj_other1=(parseFloat(lj_aiInactivatedimmuneamountother)+parseFloat(aiInactivatedimmuneamountother)).toFixed(2);
			var lj_sum1=(parseFloat(lj_chicken1)+parseFloat(lj_duck1)+parseFloat(lj_goose1)+parseFloat(lj_other1)).toFixed(2);
            $("td[role=lj_aiInactivatedvaccine]").text((parseFloat(lj_aiInactivatedvaccine)+parseFloat(aiInactivatedvaccine)).toFixed(2));
            $("td[role=lj_aiInactivatedimmuneamountchicken]").text(lj_chicken1);
            $("td[role=lj_aiInactivatedimmuneamountduck]").text(lj_duck1);
            $("td[role=lj_aiInactivatedimmuneamountgoose]").text(lj_goose1);
            $("td[role=lj_aiInactivatedimmuneamountother]").text(lj_other1);
            $("td[role=lj_sum1]").text(lj_sum1);
            var aiJointvaccine = $.trim($('td[n="aiJointvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointvaccine"]').text()));
            var aiJointimmuneamountchicken = $.trim($('td[n="aiJointimmuneamountchicken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountchicken"]').text()));
            var aiJointimmuneamountduck = $.trim($('td[n="aiJointimmuneamountduck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountduck"]').text()));
            var aiJointimmuneamountgoose = $.trim($('td[n="aiJointimmuneamountgoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountgoose"]').text()));
            var aiJointimmuneamountother = $.trim($('td[n="aiJointimmuneamountother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiJointimmuneamountother"]').text()));
            var lj_aiJointvaccine=document.getElementById('aiJointvaccine').value;
            var lj_aiJointimmuneamountchicken=document.getElementById('aiJointimmuneamountchicken').value;
            var lj_aiJointimmuneamountduck=document.getElementById('aiJointimmuneamountduck').value;
            var lj_aiJointimmuneamountgoose=document.getElementById('aiJointimmuneamountgoose').value;
            var lj_aiJointimmuneamountother=document.getElementById('aiJointimmuneamountother').value;
            var lj_chicken2=(parseFloat(lj_aiJointimmuneamountchicken)+parseFloat(aiJointimmuneamountchicken)).toFixed(2);
            var lj_duck2=(parseFloat(lj_aiJointimmuneamountduck)+parseFloat(aiJointimmuneamountduck)).toFixed(2);
            var lj_goose2=(parseFloat(lj_aiJointimmuneamountgoose)+parseFloat(aiJointimmuneamountgoose)).toFixed(2);
            var lj_other2=(parseFloat(lj_aiJointimmuneamountother)+parseFloat(aiJointimmuneamountother)).toFixed(2);
            var lj_sum2=(parseFloat(lj_chicken2)+parseFloat(lj_duck2)+parseFloat(lj_goose2)+parseFloat(lj_other2)).toFixed(2);
            $("td[role=lj_aiJointvaccine]").text((parseFloat(lj_aiJointvaccine)+parseFloat(aiJointvaccine)).toFixed(2));
            $("td[role=lj_aiJointimmuneamountchicken]").text(lj_chicken2);
            $("td[role=lj_aiJointimmuneamountduck]").text(lj_duck2);
            $("td[role=lj_aiJointimmuneamountgoose]").text(lj_goose2);
            $("td[role=lj_aiJointimmuneamountother]").text(lj_other2);
            $("td[role=lj_sum2]").text(lj_sum2);
            var aiH5H7Vaccine = $.trim($('td[n="aiH5H7Vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiH5H7Vaccine"]').text()));
            var aiH5H7ImmuneAmountChicken = $.trim($('td[n="aiH5H7ImmuneAmountChicken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiH5H7ImmuneAmountChicken"]').text()));
            var aiH5H7ImmuneAmountDuck = $.trim($('td[n="aiH5H7ImmuneAmountDuck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiH5H7ImmuneAmountDuck"]').text()));
            var aiH5H7ImmuneAmountGoose = $.trim($('td[n="aiH5H7ImmuneAmountGoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiH5H7ImmuneAmountGoose"]').text()));
            var aiH5H7ImmuneAmountOther = $.trim($('td[n="aiH5H7ImmuneAmountOther"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="aiH5H7ImmuneAmountOther"]').text()));
            var lj_aiH5H7Vaccine=document.getElementById('aiH5H7Vaccine').value;
            var lj_aiH5H7ImmuneAmountChicken=document.getElementById('aiH5H7ImmuneAmountChicken').value;
            var lj_aiH5H7ImmuneAmountDuck=document.getElementById('aiH5H7ImmuneAmountDuck').value;
            var lj_aiH5H7ImmuneAmountGoose=document.getElementById('aiH5H7ImmuneAmountGoose').value;
            var lj_aiH5H7ImmuneAmountOther=document.getElementById('aiH5H7ImmuneAmountOther').value;
            var lj_chicken3=(parseFloat(lj_aiH5H7ImmuneAmountChicken)+parseFloat(aiH5H7ImmuneAmountChicken)).toFixed(2);
            var lj_duck3=(parseFloat(lj_aiH5H7ImmuneAmountDuck)+parseFloat(aiH5H7ImmuneAmountDuck)).toFixed(2);
            var lj_goose3=(parseFloat(lj_aiH5H7ImmuneAmountGoose)+parseFloat(aiH5H7ImmuneAmountGoose)).toFixed(2);
            var lj_other3=(parseFloat(lj_aiH5H7ImmuneAmountOther)+parseFloat(aiH5H7ImmuneAmountOther)).toFixed(2);
            var lj_sum3=(parseFloat(lj_chicken3)+parseFloat(lj_duck3)+parseFloat(lj_goose3)+parseFloat(lj_other3)).toFixed(2);
            $("td[role=lj_aiH5H7Vaccine]").text((parseFloat(lj_aiH5H7Vaccine)+parseFloat(aiH5H7Vaccine)).toFixed(2));
            $("td[role=lj_aiH5H7ImmuneAmountChicken]").text(lj_chicken3);
            $("td[role=lj_aiH5H7ImmuneAmountDuck]").text(lj_duck3);
            $("td[role=lj_aiH5H7ImmuneAmountGoose]").text(lj_goose3);
            $("td[role=lj_aiH5H7ImmuneAmountOther]").text(lj_other3);
            $("td[role=lj_sum3]").text(lj_sum3);
            var lj_chicken=(parseFloat(lj_chicken1)+parseFloat(lj_chicken2)+parseFloat(lj_chicken3)).toFixed(2);
            var lj_duck=(parseFloat(lj_duck1)+parseFloat(lj_duck2)+parseFloat(lj_duck3)).toFixed(2);
            var lj_goose=(parseFloat(lj_goose1)+parseFloat(lj_goose2)+parseFloat(lj_goose3)).toFixed(2);
            var lj_other=(parseFloat(lj_other1)+parseFloat(lj_other2)+parseFloat(lj_other3)).toFixed(2);
            var lj_sum=(parseFloat(lj_sum1)+parseFloat(lj_sum2)+parseFloat(lj_sum3)).toFixed(2);
            var immunebirdfluchecken = $.trim($('td[n="immunebirdfluchecken"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunebirdfluchecken"]').text()));
            var immunebirdfluduck = $.trim($('td[n="immunebirdfluduck"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunebirdfluduck"]').text()));
            var immunebirdflugoose = $.trim($('td[n="immunebirdflugoose"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunebirdflugoose"]').text()));
            var immunebirdfluother = $.trim($('td[n="immunebirdfluother"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="immunebirdfluother"]').text()));
            var immunebirdSum=(parseFloat(immunebirdfluchecken)+parseFloat(immunebirdfluduck)+parseFloat(immunebirdflugoose)+parseFloat(immunebirdfluother)).toFixed(2);
            $('td[n="immunebirdSum"]').text(immunebirdSum);
            var jz_chicken=parseFloat(immunebirdfluchecken)==parseFloat(0)?0:(parseFloat(lj_chicken*100)/parseFloat(immunebirdfluchecken)).toFixed(2);
            var jz_duck=parseFloat(immunebirdfluduck)==parseFloat(0)?0:(parseFloat(lj_duck*100)/parseFloat(immunebirdfluduck)).toFixed(2);
            var jz_goose=parseFloat(immunebirdflugoose)==parseFloat(0)?0:(parseFloat(lj_goose*100)/parseFloat(immunebirdflugoose)).toFixed(2);
            var jz_other=parseFloat(immunebirdfluother)==parseFloat(0)?0:(parseFloat(lj_other*100)/parseFloat(immunebirdfluother)).toFixed(2);
            var jz_sum=parseFloat(immunebirdSum)==parseFloat(0)?0:(parseFloat(lj_sum*100)/parseFloat(immunebirdSum)).toFixed(2);
			var flag="true";
			var msg="";
			if(immunebirdfluchecken<lj_chicken){
                flag="false";
				msg="鸡的累计免疫数量大于应免数量，请确认！";
			}
            if(immunebirdfluduck<lj_duck){
                flag="false";
                msg="鸭的累计免疫数量大于应免数量，请确认！";
            }
            if(immunebirdflugoose<lj_goose){
                flag="false";
                msg="鹅的累计免疫数量大于应免数量，请确认！";
            }
            if(immunebirdfluother<lj_other){
                flag="false";
                msg="其他的累计免疫数量大于应免数量，请确认！";
            }
            $("#valid").val(flag);
            $("#valid-msg").val(msg);
            $('td[n="jz_immunebirdfluchecken"]').text(jz_chicken+"%");
            $('td[n="jz_immunebirdfluduck"]').text(jz_duck+"%");
            $('td[n="jz_immunebirdflugoose"]').text(jz_goose+"%");
            $('td[n="jz_immunebirdfluother"]').text(jz_other+"%");
            $('td[n="jz_sum"]').text(jz_sum+"%");

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
