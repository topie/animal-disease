<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1 {
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
        height: 28.5pt;
    }

    .r5 {
        height: 21.0pt;
    }

    .r6 {
        height: 25.5pt;
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
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c3 {
        white-space: pre-wrap;
        text-align: left;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c4 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c5 {
        white-space: pre-wrap;
        text-align: left;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c6 {
        white-space: pre-wrap;
        text-align: center;
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
        background-color: #ff8080;
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
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c10 {
        white-space: pre-wrap;
        text-align: left;
        border-top: thin solid black;
        border-right: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }
    </style>
    <meta content="lsj" name="author">
</head>
<body class="b1">

<table class="t1">
    <colgroup>
        <col width="143">
        <col width="80">
        <col width="81">
        <col width="75">
        <col width="77">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="5">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="4">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c4">填表日期:</td>
        <td class="c5" colspan="4"><#if item.echDate??>${item.echDate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c4">填 表 人:</td>
        <td class="c5" colspan="4">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c4">主管领导：</td>
        <td class="c5" colspan="4">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c4" rowspan="2">疫苗种类</td>
        <td class="c4" rowspan="2">本月疫苗使用数量(万头份)</td>
        <td class="c6" rowspan="2">累计疫苗使用数量(万头份)</td>
        <td class="c4" rowspan="2">本月免疫数量（万只）</td>
        <td class="c4" rowspan="2">累计免疫数量(万只)</td>
    </tr>
    <tr class="r5"></tr>
    <tr class="r6">
        <td class="c7">羊棘球蚴（包虫）病基因工程亚单位疫苗</td>
        <td role="data" n="echInactivatedvaccine"  class="c7"><#if item.echInactivatedvaccine??>${item.echInactivatedvaccine}</#if></td>
        <td role="lj_echInactivatedvaccine" class="c8"><#if itemSum.echInactivatedvaccine??>${itemSum.echInactivatedvaccine}</#if></td>
        <td role="data" n="echInactivatedimmuneamount" class="c7"><#if item.echInactivatedimmuneamount??>${item.echInactivatedimmuneamount}</#if></td>
        <td role="lj_echInactivatedimmuneamount" class="c8"><#if itemSum.echInactivatedimmuneamount??>${itemSum.echInactivatedimmuneamount}</#if></td>
        <input id="echInactivatedvaccine" type="hidden" value="${itemSum.echInactivatedvaccine?default(0)-item.echInactivatedvaccine?default(0)}"/>
        <input id="echInactivatedimmuneamount" type="hidden" value="${itemSum.echInactivatedimmuneamount?default(0)-item.echInactivatedimmuneamount?default(0)}"/>
    </tr>
    <tr class="r3">
        <td class="c9" rowspan="3">填报说明：</td>
        <td class="c10" colspan="4">1.本月免疫数量是指填报本月的免疫数量；</td>
    </tr>
    <tr class="r3">
        <td class="c5" colspan="4">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
    </tr>
    <tr class="r3">
        <td class="c3" colspan="4">3.未开展包虫病免疫的省份请填"0"。</td>
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
            var echInactivatedvaccine = $.trim($('td[n="echInactivatedvaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="echInactivatedvaccine"]').text()));
            var echInactivatedimmuneamount = $.trim($('td[n="echInactivatedimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="echInactivatedimmuneamount"]').text()));
            var lj_echInactivatedvaccine=document.getElementById('echInactivatedvaccine').value;
            var lj_echInactivatedimmuneamount=document.getElementById('echInactivatedimmuneamount').value;
            $("td[role=lj_echInactivatedvaccine]").text((parseFloat(lj_echInactivatedvaccine)+parseFloat(echInactivatedvaccine)).toFixed(2));
            $("td[role=lj_echInactivatedimmuneamount]").text((parseFloat(lj_echInactivatedimmuneamount)+parseFloat(echInactivatedimmuneamount)).toFixed(2));
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
