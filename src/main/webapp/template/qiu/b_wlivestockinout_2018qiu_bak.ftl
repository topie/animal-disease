<style type="text/css">
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
        height: 64.5pt;
    }

    .r4 {
        height: 22.0pt;
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
        border-right: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c5 {
        white-space: pre-wrap;
        text-align: left;
        border-top: thin solid black;
        border-right: thin solid black;
        border-left: thin solid black;
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
        border-top: thin solid black;
        border-right: thin solid black;
        border-left: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c8 {
        white-space: pre-wrap;
        text-align: center;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        color: black;
        font-size: 10pt;
    }

    .c9 {
        white-space: pre-wrap;
        border-top: thin solid black;
        border-right: thin solid black;
        border-bottom: thin solid black;
        border-left: thin solid black;
        font-size: 10pt;
    }
</style>

<table class="t1">
    <colgroup>
        <col width="66">
        <col width="76">
        <col width="54">
        <col width="58">
        <col width="62">
        <col width="68">
        <col width="48">
        <col width="55">
        <col width="52">
        <col width="51">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="52">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
        <col width="50">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="37">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="36">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="36"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if>
    </tr>
    <tr class="r2">
        <td class="c2">&nbsp;填 表 人:</td>
        <td class="c3" colspan="36">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">&nbsp;主管领导：</td>
        <td class="c5" colspan="36">${user.leaderName}</td>
    </tr>
    <tr class="r3">
        <td class="c3">&nbsp;</td>
        <td class="c2" colspan="8">存栏数量（万头/只/羽）</td>
        <td class="c2" colspan="2">牲畜O型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">O型-A型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="3">O型-亚I型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">O型-A型-亚I型口蹄疫应免数量（万头/只）</td>
        <td class="c2" colspan="4">A型口蹄疫应免数量（万头/只）</td>

        <td class="c2" colspan="4">禽流感应免数量（万羽）</td>
        <td class="c2">高致病性猪蓝耳病应免数量（万头）</td>
        <td class="c6">猪瘟应免数量（万头）</td>
        <td class="c7">新城疫应免数量（万羽）</td>
        <td class="c8">小反刍兽疫应免数量（万只）</td>
        <td class="c2" colspan="2">布鲁氏菌病应免数量（万头/只）</td>
        <td class="c2">包虫病应免数量（万只）</td>
    </tr>
    <tr class="r2">
        <td class="c2">畜禽种类</td>
        <!-- 存栏量 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <!-- 口蹄疫  -->
        <!--O型 -->
        <td class="c2">猪</td>
        <td class="c2">其它畜</td>
        <!--O-A型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!--O-亚I型 -->
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!--O-A-亚I型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!--A型 -->
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它畜</td>
        <!-- 禽流感  -->
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c2">其它禽</td>
        <!-- 猪蓝耳-->
        <td class="c2">猪</td>
        <!-- 猪瘟-->
        <td class="c6">猪</td>
        <!-- 新城疫-->
        <td class="c7">鸡</td>
        <!-- 小反刍兽疫-->
        <td class="c8">羊</td>
        <!-- 布鲁氏菌病-->
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <!-- 包虫病-->
        <td class="c2">羊</td>
    </tr>
    <tr class="r4">
        <td class="c9">&nbsp;-</td>
        <!-- 存栏量 -->
        <td role="data" n="herdspig" class="c2">${item.herdspig}</td>
        <td role="data" n="herdsniu" class="c2">${item.herdsniu}</td>
        <td role="data" n="herdssheep" class="c2">${item.herdssheep}</td>
        <td role="data" n="herdsother" class="c2">${item.herdsother}</td>
        <td role="data" n="herdschicken" class="c2">${item.herdschicken}</td>
        <td role="data" n="herdsduck" class="c2">${item.herdsduck}</td>
        <td role="data" n="herdsgoose" class="c2">${item.herdsgoose}</td>
        <td role="data" n="herdsotherq" class="c2">${item.herdsotherq}</td>
        <!-- 口蹄疫  -->
        <!--O型 -->
        <td role="data" n="immunefmdpig" class="c2">${item.immunefmdpig}</td>
        <td role="data" n="immunefmdother" class="c2">${item.immunefmdother}</td>
        <!--O-A型 -->
        <td role="data" n="immuneOafmdzhu" class="c2">${item.immuneOafmdzhu}</td>
        <td role="data" n="immuneOafmdniu" class="c2">${item.immuneOafmdniu}</td>
        <td role="data" n="immuneOafmdsheep" class="c2">${item.immuneOafmdsheep}</td>
        <td role="data" n="immuneOafmdother" class="c2">${item.immuneOafmdother}</td>
        <!--O-亚I型 -->
        <td role="data" n="immuneOifmdniu" class="c2">${item.immuneOifmdniu}</td>
        <td role="data" n="immuneOifmdSheep" class="c2">${item.immuneOifmdSheep}</td>
         <td role="data" n="immuneOifmdOther" class="c2">${item.immuneOifmdOther}</td>
        <!--O-A-亚I型 -->
        <td role="data" n="immuneOaifmdzhu" class="c2">${item.immuneOaifmdzhu}</td>
        <td role="data" n="immuneOaifmdniu" class="c2">${item.immuneOaifmdniu}</td>
        <td role="data" n="immuneOaifmdsheep" class="c2">${item.immuneOaifmdsheep}</td>
        <td role="data" n="immuneOaifmdother" class="c2">${item.immuneOaifmdother}</td>
        <!--A型 -->
        <td role="data" n="immuneafmdzhu" class="c2">${item.immuneafmdzhu}</td>
        <td role="data" n="immuneafmdniu" class="c2">${item.immuneafmdniu}</td>
        <td role="data" n="immuneafmdsheep" class="c2">${item.immuneafmdsheep}</td>
        <td role="data" n="immuneafmdother" class="c2">${item.immuneafmdother}</td>
        <!-- 禽流感  -->
        <td role="data" n="immunebirdfluchecken" class="c2">${item.immunebirdfluchecken}</td>
        <td role="data" n="immunebirdfluduck" class="c2">${item.immunebirdfluduck}</td>
        <td role="data" n="immunebirdflugoose" class="c2">${item.immunebirdflugoose}</td>
        <td role="data" n="immunebirdfluother" class="c2">${item.immunebirdfluother}</td>
        <!-- 猪蓝耳-->
        <td role="data" n="immuneblueear" class="c2">${item.immuneblueear}</td>
        <!-- 猪瘟-->
        <td role="data" n="immuneswine" class="c2">${item.immuneswine}</td>
        <!-- 新城疫-->
        <td role="data" n="immunenewcastle" class="c2">${item.immunenewcastle}</td>
        <!-- 小反刍兽疫-->
        <td role="data" n="pestedespetitsruminants" class="c8">${item.pestedespetitsruminants}</td>
        <!-- 布鲁氏菌病-->
        <td role="data" n="immuneBruniu" class="c2"><#if item.immuneBruniu??>${item.immuneBruniu}</#if></td>
        <td role="data" n="immuneBruSheep" class="c2"><#if item.immuneBruSheep??>${item.immuneBruSheep}</#if></td>
        <!-- 包虫病-->
        <td role="data" n="immuneEchSheep"  class="c2"><#if item.immuneEchSheep??>${item.immuneEchSheep}</#if></td>

    </tr>

    </tbody>
</table>
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
