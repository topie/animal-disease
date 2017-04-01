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
        height: 62.25pt;
    }

    .r5 {
        height: 21.75pt;
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
        border-top: thin solid black;
        border-right: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

</style>
<table class="t1">
    <colgroup>
        <col width="86">
        <col width="76">
        <col width="54">
        <col width="53">
        <col width="56">
        <col width="68">
        <col width="48">
        <col width="55">
        <col width="51">
        <col width="57">
        <col width="56">
        <col width="52">
        <col width="57">
        <col width="66">
        <col width="56">
        <col width="56">
        <col width="56">
        <col width="58">
        <col width="66">
        <col width="70">
        <col width="66">
        <col width="65">
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
        <td class="c3" colspan="21"><#if item.livestockdate??>${item.livestockdate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">&nbsp;&nbsp;填 表 人:</td>
        <td class="c3" colspan="21">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c4">主管领导：</td>
        <td class="c3" colspan="21">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2">&nbsp;</td>
        <td class="c2" colspan="8">当月存栏数量(万头/只/羽)</td>
        <td class="c2" colspan="4">牲畜口蹄疫当月应免数量(万头/只)</td>
        <td class="c2" colspan="4">禽流感当月应免数量(万羽)</td>
        <td class="c2" colspan="2">A型口蹄疫当月应免数量（万头）</td>
        <td class="c2">高致病性猪蓝耳病当月应免数量(万头)</td>
        <td class="c2">猪瘟当月应免数量(万头)</td>
        <td class="c2">新城疫当月应免数量(万羽)</td>
    </tr>
    <tr class="r2">
        <td class="c2">畜种</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">猪</td>
        <td class="c2">猪</td>
        <td class="c2">鸡</td>
    </tr>
    <tr class="r5">
        <td class="c2">数量</td>
        <td role="data" n="herdspig" class="c2"><#if item.herdspig??>${item.herdspig}</#if></td>
        <td role="data" n="herdsniu" class="c2"><#if item.herdsniu??>${item.herdsniu}</#if></td>
        <td role="data" n="herdssheep" class="c2"><#if item.herdssheep??>${item.herdssheep}</#if></td>
        <td role="data" n="herdsother" class="c2"><#if item.herdsother??>${item.herdsother}</#if></td>
        <td role="data" n="herdschicken" class="c2"><#if item.herdschicken??>${item.herdschicken}</#if></td>
        <td role="data" n="herdsduck" class="c2"><#if item.herdsduck??>${item.herdsduck}</#if></td>
        <td role="data" n="herdsgoose" class="c2"><#if item.herdsgoose??>${item.herdsgoose}</#if></td>
        <td role="data" n="herdsotherq" class="c2"><#if item.herdsotherq??>${item.herdsotherq}</#if></td>
        <td role="data" n="immunefmdpig" class="c2"><#if item.immunefmdpig??>${item.immunefmdpig}</#if></td>
        <td role="data" n="immunefmdniu" class="c2"><#if item.immunefmdniu??>${item.immunefmdniu}</#if></td>
        <td role="data" n="immunefmdsheep" class="c2"><#if item.immunefmdsheep??>${item.immunefmdsheep}</#if></td>
        <td role="data" n="immunefmdother" class="c2"><#if item.immunefmdother??>${item.immunefmdother}</#if></td>
        <td role="data" n="immunebirdfluchecken" class="c2"><#if item.immunebirdfluchecken??>${item.immunebirdfluchecken}</#if></td>
        <td role="data" n="immunebirdfluduck" class="c2"><#if item.immunebirdfluduck??>${item.immunebirdfluduck}</#if></td>
        <td role="data" n="immunebirdflugoose" class="c2"><#if item.immunebirdflugoose??>${item.immunebirdflugoose}</#if></td>
        <td role="data" n="immunebirdfluother"  class="c2"><#if item.immunebirdfluother??>${item.immunebirdfluother}</#if></td>
        <td role="data" n="immuneafmdniu" class="c2"><#if item.immuneafmdniu??>${item.immuneafmdniu}</#if></td>
        <td role="data" n="immuneafmdsheep" class="c2"><#if item.immuneafmdsheep??>${item.immuneafmdsheep}</#if></td>
        <td role="data" n="immuneblueear" class="c2"><#if item.immuneblueear??>${item.immuneblueear}</#if></td>
        <td role="data" n="immuneswine" class="c2"><#if item.immuneswine??>${item.immuneswine}</#if></td>
        <td role="data" n="immunenewcastle"  class="c2"><#if item.immunenewcastle??>${item.immunenewcastle}</#if></td>

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

