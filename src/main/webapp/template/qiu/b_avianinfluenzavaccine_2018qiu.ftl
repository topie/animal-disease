<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1{white-space-collapsing:preserve;}
    .t1{width:100%;border-collapse:collapse;border-spacing:0;}
    .r1{height:24.75pt;}
    .r2{height:15.0pt;}
    .r3{height:16.5pt;}
    .r4{height:22.5pt;}
    .r5{height:18.0pt;}
    .r6{height:112.5pt;}
    .r7{height:22.0pt;}
    .c1{white-space:pre-wrap;text-align:center;color: black; font-size:16pt;}
    .c2{white-space:pre-wrap;text-align:center;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    .c3{white-space:pre-wrap;text-align:left;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    .c4{white-space:pre-wrap;text-align:center;color: black; font-size:10pt;}
    </style>
</head>
<body class="b1">

<table class="t1">
    <colgroup>
        <col width="75">
        <col width="72">

        <col width="68">
        <col width="67">
        <col width="67">

        <col width="67">
        <col width="66">
        <col width="66">

        <col width="68">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="9">${templateName}统计表</td>
    </tr>
    <tr class="r2">
        <td class="c2">单    位:</td><td class="c3" colspan="26">${item.avRegionname}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td><td class="c3" colspan="26"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">填 表 人:</td><td class="c3" colspan="26">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导：</td><td class="c3" colspan="26">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2" colspan="9">禽流感疫苗</td>
    </tr>
    <tr class="r5">
        <td class="c2" colspan="3">使用数量</td>
        <td class="c2" colspan="3">目前库存数量</td>
        <td class="c2" colspan="3">全年使用数量</td>
    </tr>
    <tr class="r6">
        <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
        <td class="c2">高致病性禽流感灭活疫苗（万毫升）</td>

        <td class="c2">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
        <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
        <td class="c2">高致病性禽流感灭活疫苗（万毫升）</td>

        <td class="c2">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
        <td class="c2">重组禽流感病毒（H5+H7）二价灭活疫苗（H5N1 Re-8株+H7N9 H7-Re-1株）（万毫升）</td>
        <td class="c2">高致病性禽流感灭活疫苗（万毫升）</td>

        <td class="c2">禽流感-新城疫重组二联活疫苗（rL-H5-6株）（万羽份）</td>
    </tr>
    <tr class="r7">
        <td role="data" n="avH5H7UseCount" class="c2"><#if item.avH5H7UseCount??>${item.avH5H7UseCount}</#if></td>
        <td role="data" n="avMhUseCount" class="c2"><#if item.avMhUseCount??>${item.avMhUseCount}</#if></td>

        <td role="data" n="avRhrh5usecount" class="c2"><#if item.avRhrh5usecount??>${item.avRhrh5usecount}</#if></td>
        <td role="data" n="avH5H7StoreCount" class="c2"><#if item.avH5H7StoreCount??>${item.avH5H7StoreCount}</#if></td>
        <td role="data" n="avMhStoreCount" class="c2"><#if item.avMhStoreCount??>${item.avMhStoreCount}</#if></td>

        <td role="data" n="avRhrh5storecount" class="c2"><#if item.avRhrh5storecount??>${item.avRhrh5storecount}</#if></td>
        <td role="data" n="avH5H7YearCount" class="c2"><#if item.avH5H7YearCount??>${item.avH5H7YearCount}</#if></td>
        <td role="data" n="avMhYearCount" class="c2"><#if item.avMhYearCount??>${item.avMhYearCount}</#if></td>

        <td role="data" n="avRhrh5yearcount" class="c2"><#if item.avRhrh5yearcount??>${item.avRhrh5yearcount}</#if></td>
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
