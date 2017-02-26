<style type="text/css">

    .t1 {
        border-collapse: collapse;
        border-spacing: 0;
        width: 99%;
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

</style>
<table class="t1">
    <colgroup>
        <col width="82">
        <col width="77">
        <col width="87">
        <col width="87">
        <col width="78">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="6">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位</td>
        <td class="c3" colspan="5">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期</td>
        <td class="c3" colspan="5"><#if item.dfDate??>${item.dfDate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c2">填 表 人</td>
        <td class="c3" colspan="5">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">主管领导</td>
        <td class="c3" colspan="5">${user.leaderName}</td>
    </tr>
    <tr class="r2">
        <td class="c2" colspan="2">消毒药品种类</td>
        <td class="c2">省级存储数量</td>
        <td class="c2">全省存储数量</td>
        <td class="c2" colspan="2">备注</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="2">消毒药（吨）</td>
        <td role="data" n="dfDrugs" class="c2">${item.dfDrugs}</td>
        <td role="data" n="dfAlldrugs" class="c2">${item.dfAlldrugs}</td>
        <td class="c2" colspan="2">&nbsp;</td>
    </tr>
    <tr class="r3">
        <td class="c2" colspan="2">消毒剂（升）</td>
        <td role="data" n="dfPharmacy" class="c2">${item.dfPharmacy}</td>
        <td role="data" n="dfAllpharmacy" class="c2">${item.dfAllpharmacy}</td>
        <td class="c2" colspan="2">&nbsp;</td>
    </tr>
    <tr class="r4">
        <td class="c2" colspan="2">其它（吨）</td>
        <td role="data" n="dfOther" class="c2">${item.dfOther}</td>
        <td role="data" n="dfAllother" class="c2">${item.dfAllother}</td>
        <td class="c2" colspan="2">&nbsp;</td>
    </tr>
    </tbody>
</table>
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
