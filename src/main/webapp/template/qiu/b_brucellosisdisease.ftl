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
        height: 15.0pt;
    }

    .r3 {
        height: 16.5pt;
    }

    .r4 {
        height: 28.5pt;
    }

    .r5 {
        height: 27.75pt;
    }

    .r6 {
        height: 18.75pt;
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
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c6 {
        white-space: pre-wrap;
        text-align: center;
        background-color: #ff8080;
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
        border-right: thin solid black;
        border-bottom: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c8 {
        white-space: pre-wrap;
        text-align: center;
        background-color: #ff8080;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        color: black;
        font-size: 10pt;
    }
    </style>
    <meta content="lsj" name="author">
</head>
<body class="b1">
<table class="t1">
    <colgroup>
        <col width="125">
        <col width="85">
        <col width="78">
        <col width="83">
        <col width="83">
        <col width="66">
        <col width="66">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="7">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="6">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="6"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">填 表 人:</td>
        <td class="c3" colspan="6">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导：</td>
        <td class="c3" colspan="6">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2" rowspan="2">疫苗种类</td>
        <td class="c2" rowspan="2">本月疫苗使用数量(万头份)</td>
        <td class="c4" rowspan="2">累计疫苗使用数量(万头份)</td>
        <td class="c2" colspan="2">本月免疫数量（万头）</td>
        <td class="c2" colspan="2">累计免疫数量(万头)</td>
    </tr>
    <tr class="r5">
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
    </tr>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(S2株)</td>
        <td role="data" n="brus2Vaccine"  class="c2"><#if item.brus2Vaccine??>${item.brus2Vaccine}</#if></td>
        <td role="lj_brus2Vaccine" class="c6"><#if itemSum.brus2Vaccine??>${itemSum.brus2Vaccine}</#if></td>
        <td role="data" n="brus2Niuimmuneamount" class="c2"><#if item.brus2Niuimmuneamount??>${item.brus2Niuimmuneamount}</#if></td>
        <td role="data" n="brus2Sheepimmuneamount" class="c2"><#if item.brus2Sheepimmuneamount??>${item.brus2Sheepimmuneamount}</#if></td>
        <td role="lj_brus2Niuimmuneamount" class="c7"><#if itemSum.brus2Niuimmuneamount??>${itemSum.brus2Niuimmuneamount}</#if></td>
        <td role="lj_brus2Sheepimmuneamount" class="c7"><#if itemSum.brus2Sheepimmuneamount??>${itemSum.brus2Sheepimmuneamount}</#if></td>

    </tr>
    <input id="brus2Vaccine" type="hidden" value="${itemSum.brus2Vaccine?default(0)-item.brus2Vaccine?default(0)}"/>
    <input id="brus2Niuimmuneamount" type="hidden" value="${itemSum.brus2Niuimmuneamount?default(0)-item.brus2Niuimmuneamount?default(0)}"/>
    <input id="brus2Sheepimmuneamount" type="hidden" value="${itemSum.brus2Sheepimmuneamount?default(0)-item.brus2Sheepimmuneamount?default(0)}"/>
    <input id="brum5Vaccine" type="hidden" value="${itemSum.brum5Vaccine?default(0)-item.brum5Vaccine?default(0)}"/>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(M5株)</td>
        <td role="data" n="brum5Vaccine"  class="c2"><#if item.brum5Vaccine??>${item.brum5Vaccine}</#if></td>
        <td role="lj_brum5Vaccine" class="c6"><#if itemSum.brum5Vaccine??>${itemSum.brum5Vaccine}</#if></td>
        <td role="data" n="brum5Niuimmuneamount" class="c2"><#if item.brum5Niuimmuneamount??>${item.brum5Niuimmuneamount}</#if></td>
        <td role="data" n="brum5Sheepimmuneamount" class="c2"><#if item.brum5Sheepimmuneamount??>${item.brum5Sheepimmuneamount}</#if></td>
        <td role="lj_brum5Niuimmuneamount" class="c7"><#if itemSum.brum5Niuimmuneamount??>${itemSum.brum5Niuimmuneamount}</#if></td>
        <td role="lj_brum5Sheepimmuneamount" class="c7"><#if itemSum.brum5Sheepimmuneamount??>${itemSum.brum5Sheepimmuneamount}</#if></td>
    </tr>
    <input id="brum5Niuimmuneamount" type="hidden" value="${itemSum.brum5Niuimmuneamount?default(0)-item.brum5Niuimmuneamount?default(0)}"/>
    <input id="brum5Sheepimmuneamount" type="hidden" value="${itemSum.brum5Sheepimmuneamount?default(0)-item.brum5Sheepimmuneamount?default(0)}"/>
    <input id="brua19Vaccine" type="hidden" value="${itemSum.brua19Vaccine?default(0)-item.brua19Vaccine?default(0)}"/>
    <input id="brua19Niuimmuneamount" type="hidden" value="${itemSum.brua19Niuimmuneamount?default(0)-item.brua19Niuimmuneamount?default(0)}"/>
    <tr class="r3">
        <td class="c2">布鲁氏菌活疫苗(A19株)</td>
        <td role="data" n="brua19Vaccine"  class="c2"><#if item.brua19Vaccine??>${item.brua19Vaccine}</#if></td>
        <td role="lj_brua19Vaccine" class="c6"><#if itemSum.brua19Vaccine??>${itemSum.brua19Vaccine}</#if></td>
        <td role="data" n="brua19Niuimmuneamount" class="c2"><#if item.brua19Niuimmuneamount??>${item.brua19Niuimmuneamount}</#if></td>
        <td role="data" n="brua19Sheepimmuneamount" class="c2"><#if item.brua19Sheepimmuneamount??>${item.brua19Sheepimmuneamount}</#if></td>
        <td role="lj_brua19Niuimmuneamount" class="c7"><#if itemSum.brua19Niuimmuneamount??>${itemSum.brua19Niuimmuneamount}</#if></td>
        <td role="lj_brua19Sheepimmuneamount" class="c7"><#if itemSum.brua19Sheepimmuneamount??>${itemSum.brua19Sheepimmuneamount}</#if></td>
    </tr>
    <input id="brua19Sheepimmuneamount" type="hidden" value="${itemSum.brua19Sheepimmuneamount?default(0)-item.brua19Sheepimmuneamount?default(0)}"/>
    <tr class="r3">
        <td class="c2" rowspan="3">填报说明：</td>
        <td class="c3" colspan="6">1.本月免疫数量是指填报本月的免疫数量；</td>
    </tr>
    <tr class="r3">
        <td class="c3" colspan="6">2.使用的疫苗种类与其使用数量、免疫动物数量相对应；</td>
    </tr>
    <tr class="r6">
        <td class="c3" colspan="6">3.未开展布鲁氏菌病免疫的省份请填"0"。</td>
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
            var brus2Vaccine = $.trim($('td[n="brus2Vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brus2Vaccine"]').text()));
            var brus2Niuimmuneamount = $.trim($('td[n="brus2Niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brus2Niuimmuneamount"]').text()));
            var brus2Sheepimmuneamount = $.trim($('td[n="brus2Sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brus2Sheepimmuneamount"]').text()));
            var brum5Vaccine = $.trim($('td[n="brum5Vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brum5Vaccine"]').text()));
            var lj_brus2Vaccine=document.getElementById('brus2Vaccine').value;
            var lj_brus2Niuimmuneamount=document.getElementById('brus2Niuimmuneamount').value;
            var lj_brus2Sheepimmuneamount=document.getElementById('brus2Sheepimmuneamount').value;
            var lj_brum5Vaccine=document.getElementById('brum5Vaccine').value;
            $("td[role=lj_brus2Vaccine]").text((parseFloat(lj_brus2Vaccine)+parseFloat(brus2Vaccine)).toFixed(2));
            $("td[role=lj_brus2Niuimmuneamount]").text((parseFloat(lj_brus2Niuimmuneamount)+parseFloat(brus2Niuimmuneamount)).toFixed(2));
            $("td[role=lj_brus2Sheepimmuneamount]").text((parseFloat(lj_brus2Sheepimmuneamount)+parseFloat(brus2Sheepimmuneamount)).toFixed(2));
            $("td[role=lj_brum5Vaccine]").text((parseFloat(lj_brum5Vaccine)+parseFloat(brum5Vaccine)).toFixed(2));

            var brum5Niuimmuneamount = $.trim($('td[n="brum5Niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brum5Niuimmuneamount"]').text()));
            var brum5Sheepimmuneamount = $.trim($('td[n="brum5Sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brum5Sheepimmuneamount"]').text()));
            var brua19Vaccine = $.trim($('td[n="brua19Vaccine"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brua19Vaccine"]').text()));
            var brua19Niuimmuneamount = $.trim($('td[n="brua19Niuimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brua19Niuimmuneamount"]').text()));
            var lj_brum5Niuimmuneamount=document.getElementById('brum5Niuimmuneamount').value;
            var lj_brum5Sheepimmuneamount=document.getElementById('brum5Sheepimmuneamount').value;
            var lj_brua19Vaccine=document.getElementById('brua19Vaccine').value;
            var lj_brua19Niuimmuneamount=document.getElementById('brua19Niuimmuneamount').value;
            $("td[role=lj_brum5Niuimmuneamount]").text((parseFloat(lj_brum5Niuimmuneamount)+parseFloat(brum5Niuimmuneamount)).toFixed(2));
            $("td[role=lj_brum5Sheepimmuneamount]").text((parseFloat(lj_brum5Sheepimmuneamount)+parseFloat(brum5Sheepimmuneamount)).toFixed(2));
            $("td[role=lj_brua19Vaccine]").text((parseFloat(lj_brua19Vaccine)+parseFloat(brua19Vaccine)).toFixed(2));
            $("td[role=lj_brua19Niuimmuneamount]").text((parseFloat(lj_brua19Niuimmuneamount)+parseFloat(brua19Niuimmuneamount)).toFixed(2));

            var brua19Sheepimmuneamount = $.trim($('td[n="brua19Sheepimmuneamount"]').text()) == "" ? 0 : parseFloat($.trim($('td[n="brua19Sheepimmuneamount"]').text()));
            var lj_brua19Sheepimmuneamount=document.getElementById('brua19Sheepimmuneamount').value;
            $("td[role=lj_brua19Sheepimmuneamount]").text((parseFloat(lj_brua19Sheepimmuneamount)+parseFloat(brua19Sheepimmuneamount)).toFixed(2));
        }

        calculate()
    })(jQuery, window, document)
</script>
</#if>
