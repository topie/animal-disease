<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1{white-space-collapsing:preserve;}
    .t1{border-collapse:collapse;border-spacing:0;}
    .r1{height:24.75pt;}
    .r2{height:15.0pt;}
    .r3{height:16.5pt;}
    .r4{height:24.0pt;}
    .r5{height:14.25pt;}
    .c1{white-space:pre-wrap;text-align:center;border-right:thin solid black;border-bottom:thin solid black;color: black; font-size:16pt;}
    .c2{white-space:pre-wrap;text-align:center;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    .c3{white-space:pre-wrap;text-align:center;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    .c4{white-space:pre-wrap;text-align:left;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    </style>
    <meta content="Administrator" name="author">
</head>
<body class="b1">
<table class="t1">
    <colgroup>
        <col width="122">
        <col width="327">
        <col width="90">
        <col width="80">
        <col width="112">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c3" colspan="5">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单   位</td><td class="c2" colspan="4">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c3">填表日期</td><td class="c3" colspan="4"><#if item.evdate??>${item.evdate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c3">填 表 人</td><td class="c3" colspan="4">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c3">主管领导</td><td class="c3" colspan="4">${user.leaderName}</td>
    </tr>
    <tr class="r2">
        <td class="c3" colspan="2">疫苗种类</td><td class="c3">省级存储数量</td><td class="c3">全省存储数量</td><td class="c3">备注</td>
    </tr>
    <tr class="r3">
        <td class="c3" rowspan="6">口蹄疫</td>
        <td class="c4">口蹄疫O型灭活类疫苗(万毫升)</td>
        <td role="data" n="evFmoinactivated"   class="c3"><#if item.evFmoinactivated??>${item.evFmoinactivated}</#if></td>
        <td role="data" n="evAllfmoinactivated"   class="c3"><#if item.evAllfmoinactivated??>${item.evAllfmoinactivated}</#if></td>
        <td role="data" n=""   class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">口蹄疫O型合成肽疫苗（万毫升）</td>
        <td role="data" n="evFmosynthetic"   class="c3"><#if item.evFmosynthetic??>${item.evFmosynthetic}</#if></td>
        <td role="data" n="evAllfmosynthetic"   class="c3"><#if item.evAllfmosynthetic??>${item.evAllfmosynthetic}</#if></td>
        <td role="data" n=""   class="c3" >&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">口蹄疫O型-亚洲I型二价灭活疫苗(万毫升)</td>
        <td role="data" n="evFmosinactivated"   class="c3"><#if item.evFmosinactivated??>${item.evFmosinactivated}</#if></td>
        <td role="data" n="evAllfmosinactivated"   class="c3"><#if item.evAllfmosinactivated??>${item.evAllfmosinactivated}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">口蹄疫O型-A型二价灭活疫苗（万毫升）</td>
        <td role="data" n="evFmoas"   class="c3"><#if item.evFmoas??>${item.evFmoas}</#if></td>
        <td role="data" n="evAllfmoas"   class="c3"><#if item.evAllfmoas??>${item.evAllfmoas}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">口蹄疫O型-A型-亚洲I型三价灭活疫苗（万毫升）</td>
        <td role="data" n="evFmoaait"   class="c3"><#if item.evFmoaait??>${item.evFmoaait}</#if></td>
        <td role="data" n="evAllfmoaait"   class="c3"><#if item.evAllfmoaait??>${item.evAllfmoaait}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">口蹄疫A型灭活疫苗（万毫升）</td>
        <td role="data" n="evFmoa"   class="c3"><#if item.evFmoa??>${item.evFmoa}</#if></td>
        <td role="data" n="evAllfmoa"   class="c3"><#if item.evAllfmoa??>${item.evAllfmoa}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c3" rowspan="8">禽流感</td>
        <td class="c4">禽流感-新城疫重组二联活疫苗（rL-H5）（万羽份）</td>
        <td role="data" n="evAirlh5"   class="c3"><#if item.evAirlh5??>${item.evAirlh5}</#if></td>
        <td role="data" n="evAllairlh5"   class="c3"><#if item.evAllairlh5??>${item.evAllairlh5}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">重组禽流感灭活疫苗（H5N1,Re-6株）（万毫升）</td>
        <td role="data" n="evAih5n1re6"   class="c3"><#if item.evAih5n1re6??>${item.evAih5n1re6}</#if></td>
        <td role="data" n="evAllaih5n1re6"   class="c3"><#if item.evAllaih5n1re6??>${item.evAllaih5n1re6}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">重组禽流感灭活疫苗（H5N1,Re-7株）（万毫升）</td>
        <td role="data" n="evAih5n1re7"   class="c3"><#if item.evAih5n1re7??>${item.evAih5n1re7}</#if></td>
        <td role="data" n="evAllaih5n1re7"   class="c3"><#if item.evAllaih5n1re7??>${item.evAllaih5n1re7}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r4">
        <td class="c4">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-8株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re8"   class="c3"><#if item.evAih5n1re6re8??>${item.evAih5n1re6re8}</#if></td>
        <td role="data" n="evAllaih5n1re6re8"   class="c3"><#if item.evAllaih5n1re6re8??>${item.evAllaih5n1re6re8}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r4">
        <td class="c4">重组禽流感病毒H5亚型二价灭活疫苗（H5N1,Re-6+Re-7株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re7"   class="c3"><#if item.evAih5n1re6re7??>${item.evAih5n1re6re7}</#if></td>
        <td role="data" n="evAllaih5n1re6re7"   class="c3"><#if item.evAllaih5n1re6re7??>${item.evAllaih5n1re6re7}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r4">
        <td class="c4">重组禽流感病毒H5亚型三价灭活疫苗（H5N1,Re-6+Re-7株+Re-8株）（万毫升）</td>
        <td role="data" n="evAih5n1re6re7re8"   class="c3"><#if item.evAih5n1re6re7re8??>${item.evAih5n1re6re7re8}</#if></td>
        <td role="data" n="evAllaih5n1re6re7re8"   class="c3"><#if item.evAllaih5n1re6re7re8??>${item.evAllaih5n1re6re7re8}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">禽流感灭活疫苗（H5N2亚型，D7株）</td>
        <td role="data" n="evAih5n2d7"   class="c3"><#if item.evAih5n2d7??>${item.evAih5n2d7}</#if></td>
        <td role="data" n="evAllaih5n2d7"   class="c3"><#if item.evAllaih5n2d7??>${item.evAllaih5n2d7}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">H5-H9二价灭活疫苗（万毫升）</td>
        <td role="data" n="evAih5h9"   class="c3"><#if item.evAih5h9??>${item.evAih5h9}</#if></td>
        <td role="data" n="evAllaih5h9"   class="c3"><#if item.evAllaih5h9??>${item.evAllaih5h9}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c3" rowspan="2">高致病性猪蓝耳病疫苗</td>
        <td class="c4">高致病性猪蓝耳病灭活疫苗(万毫升)</td>
        <td role="data" n="evBe"   class="c3"><#if item.evBe??>${item.evBe}</#if></td>
        <td role="data" n="evAllbe"   class="c3"><#if item.evAllbe??>${item.evAllbe}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c4">高致病性猪蓝耳病活疫苗(万头份)</td>
        <td role="data" n="evBeinactivated"   class="c3"><#if item.evBeinactivated??>${item.evBeinactivated}</#if><td>
        <td role="data" n="evAllbeinactivated"   class="c3"><#if item.evAllbeinactivated??>${item.evAllbeinactivated}</#if><td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c3" rowspan="2">猪瘟疫苗</td>
        <td class="c4">猪瘟活疫苗(万头份)</td>
        <td role="data" n="evCs"   class="c3"><#if item.evCs??>${item.evCs}</#if><td>
        <td role="data" n="evAllcs"   class="c3"><#if item.evAllcs??>${item.evAllcs}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">传代细胞源猪瘟活疫苗（万头份）</td>
        <td role="data" n="evCspassage"   class="c3"><#if item.evCspassage??>${item.evCspassage}</#if></td>
        <td role="data" n="evAllcspassage"   class="c3"><#if item.evAllcspassage??>${item.evAllcspassage}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c3" rowspan="2">新城疫疫苗</td>
        <td class="c4">新城疫灭活疫苗(万毫升)</td>
        <td role="data" n="evNcinactivated"   class="c3"><#if item.evNcinactivated??>${item.evNcinactivated}</#if></td>
        <td role="data" n="evAllncinactivated"   class="c3"><#if item.evAllncinactivated??>${item.evAllncinactivated}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">新城疫弱毒疫苗(万羽份)</td>
        <td role="data" n="evNcweak"   class="c3"><#if item.evNcweak??>${item.evNcweak}</#if></td>
        <td role="data" n="evAllncweak"   class="c3"><#if item.evAllncweak??>${item.evAllncweak}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c3">小反刍兽疫疫苗</td>
        <td class="c4">小反刍兽疫活疫苗（万头份）</td>
        <td role="data" n="evPdpr"   class="c3"><#if item.evPdpr??>${item.evPdpr}</#if></td>
        <td role="data" n="evAllpdpr"   class="c3"><#if item.evAllpdpr??>${item.evAllpdpr}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c3" rowspan="3">布鲁氏菌病</td>
        <td class="c4">布鲁氏菌活疫苗(S2株)</td>
        <td role="data" n="evBrucellas2" class="c3"><#if item.evBrucellas2??>${item.evBrucellas2}</#if></td>
        <td role="data" n="evAllbrucellas2"   class="c3"><#if item.evAllbrucellas2??>${item.evAllbrucellas2}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">布鲁氏菌活疫苗(M5株)</td>
        <td role="data" n="evBrucellaM5"   class="c3"><#if item.evBrucellaM5??>${item.evBrucellaM5}</#if></td>
        <td role="data" n="evAllBrucellaM5"   class="c3"><#if item.evAllBrucellaM5??>${item.evAllBrucellaM5}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c4">布鲁氏菌活疫苗(A19株)</td>
        <td role="data" n="evBrucellaa19"   class="c3"><#if item.evBrucellaa19??>${item.evBrucellaa19}</#if></td>
        <td role="data" n="evAllbrucellaa19"   class="c3"><#if item.evAllbrucellaa19??>${item.evAllbrucellaa19}</#if></td>
        <td class="c3">&nbsp;</td>
    </tr>
    <tr class="r5">
        <td class="c3">棘球蚴病</td>
        <td class="c4">羊棘球蚴（包虫）病基因工程亚单位疫苗</td>
        <td role="data" n="evSheephydatid"   class="c3"><#if item.evSheephydatid??>${item.evSheephydatid}</#if></td>
        <td role="data" n="evAllsheephydatid"   class="c3"><#if item.evAllsheephydatid??>${item.evAllsheephydatid}</#if></td>
        <td class="c3">&nbsp;</td>
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

