<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1 {
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
        height: 16.5pt;
    }

    .r3 {
        height: 28.5pt;
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
        border-top: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c4 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c5 {
        white-space: pre-wrap;
        border-left: thin solid black;
        font-size: 12pt;
    }

    .c6 {
        white-space: pre-wrap;
        text-align: center;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c7 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-right: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c8 {
        white-space: pre-wrap;
        text-align: center;
        background-color: white;
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
        <col width="165">
        <col width="171">
        <col width="164">
        <col width="93">
        <col width="84">
        <col width="84">
        <col width="89">
        <col width="93">
        <col width="89">
        <col width="171">
        <col width="56">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="10">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="9">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="9"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c2">填 表 人:</td>
        <td class="c3" colspan="9">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导：</td>
        <td class="c3" colspan="9">${user.leaderName}</td>
        <td class="c5">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="3">包虫病疫苗</td>
        <td class="c6" colspan="7">包虫病驱虫药</td>
    </tr>
    <tr class="r3">
        <td class="c2">使用数量</td>
        <td class="c2">目前库存数量</td>
        <td class="c2">上半年使用数量</td>
        <td class="c4" colspan="2">使用数量</td>
        <td class="c4" colspan="2">目前库存数量</td>
        <td class="c4" colspan="2">上半年使用数量</td>
        <td class="c7" rowspan="2">驱虫犬只数量（万只）</td>
    </tr>
    <tr class="r3">
        <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
        <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
        <td class="c2">羊棘球蚴（包虫）病基因工程亚单位疫苗(万头份)</td>
        <td class="c2">吡喹酮咀嚼片（万头份）</td>
        <td class="c2">其他（万头份）</td>
        <td class="c2">吡喹酮咀嚼片（万头份）</td>
        <td class="c2">其他（万头份）</td>
        <td class="c2">吡喹酮咀嚼片（万头份）</td>
        <td class="c2">其他（万头份）</td>
    </tr>
    <tr class="r2">
        <td role="data" n="echVaccineusecount"  class="c8"><#if item.echVaccineusecount??>${item.echVaccineusecount}</#if></td>
        <td role="data" n="echVaccinestorecount"  class="c8"><#if item.echVaccinestorecount??>${item.echVaccinestorecount}</#if></td>
        <td role="data" n="echVaccineyearcount"  class="c8"><#if item.echVaccineyearcount??>${item.echVaccineyearcount}</#if></td>
        <td role="data" n="echAnthelminticusecount"  class="c8"><#if item.echAnthelminticusecount??>${item.echAnthelminticusecount}</#if></td>
        <td role="data" n="echAnthelminticotherusecount"  class="c8"><#if item.echAnthelminticotherusecount??>${item.echAnthelminticotherusecount}</#if></td>
        <td role="data" n="echAnthelminticstorecount"  class="c8"><#if item.echAnthelminticstorecount??>${item.echAnthelminticstorecount}</#if></td>
        <td role="data" n="echAnthelminticothestorecount"  class="c8"><#if item.echAnthelminticothestorecount??>${item.echAnthelminticothestorecount}</#if></td>
        <td role="data" n="echAnthelminticyearcount"  class="c8"><#if item.echAnthelminticyearcount??>${item.echAnthelminticyearcount}</#if></td>
        <td role="data" n="echAnthelminticotheyearcount"  class="c8"><#if item.echAnthelminticotheyearcount??>${item.echAnthelminticotheyearcount}</#if></td>
        <td role="data" n="echImmunedogcount"  class="c8"><#if item.echImmunedogcount??>${item.echImmunedogcount}</#if></td>
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

        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
