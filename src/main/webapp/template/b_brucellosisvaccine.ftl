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
        height: 22.5pt;
    }

    .r5 {
        height: 18.0pt;
    }

    .r6 {
        height: 40.5pt;
    }

    .r7 {
        height: 19.5pt;
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
        text-align: center;
        border-top: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c4 {
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
        <col width="87">
        <col width="87">
        <col width="77">
        <col width="84">
        <col width="84">
        <col width="80">
        <col width="86">
        <col width="86">
        <col width="78">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="9">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="8">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="8"><#if item.bruDate??>${item.bruDate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">填 表 人:</td>
        <td class="c3" colspan="8">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导：</td>
        <td class="c3" colspan="8">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2" colspan="9">布鲁氏菌病疫苗</td>
    </tr>
    <tr class="r5">
        <td class="c2" colspan="3">使用数量</td>
        <td class="c2" colspan="3">目前库存数量</td>
        <td class="c2" colspan="3">半年使用数量</td>
    </tr>
    <tr class="r6">
        <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(S2株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(A19株)（万头份）</td>
        <td class="c2">布氏菌病活疫苗(M5株)（万头份）</td>
    </tr>
    <tr class="r7">
        <td role="data" n="bruS2usecount"  class="c4"><#if item.bruS2usecount??>${item.bruS2usecount}</#if></td>
        <td role="data" n="bruA19usecount"  class="c4"><#if item.bruA19usecount??>${item.bruA19usecount}</#if></td>
        <td role="data" n="bruM5usecount"  class="c4"><#if item.bruM5usecount??>${item.bruM5usecount}</#if></td>
        <td role="data" n="bruS2storecount"  class="c4"><#if item.bruS2storecount??>${item.bruS2storecount}</#if></td>
        <td role="data" n="bruA19storecount"  class="c4"><#if item.bruA19storecount??>${item.bruA19storecount}</#if></td>
        <td role="data" n="bruM5storecount"  class="c4"><#if item.bruM5storecount??>${item.bruM5storecount}</#if></td>
        <td role="data" n="bruS2yearcount"  class="c4"><#if item.bruS2yearcount??>${item.bruS2yearcount}</#if></td>
        <td role="data" n="bruA19yearcount"  class="c4"><#if item.bruA19yearcount??>${item.bruA19yearcount}</#if></td>
        <td role="data" n="bruM5yearcount"  class="c4"><#if item.bruM5yearcount??>${item.bruM5yearcount}</#if></td>

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
