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

.c5 {
    white-space: pre-wrap;
    text-align: left;
    border-top: thin solid black;
    border-right: thin solid black;
    border-bottom: thin solid black;
    color: black;
    font-size: 10pt;
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
    border-top: thin solid black;
    border-right: thin solid black;
    border-bottom: thin solid black;
    border-left: thin solid black;
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
        <td class="c1" colspan="22">${fill.displayTitle}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单 位:</td>
        <td class="c3" colspan="21">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="21"><#if item.livestockDate??>${item.livestockDate?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c2">&nbsp;&nbsp;填 表 人:</td>
        <td class="c3" colspan="21">${user.realName}</td>
    </tr>
    <tr class="r2">
        <td class="c4">主管领导：</td>
        <td class="c3" colspan="21">${user.leader}</td>
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
        <td class="c5"></td>
        <td role="data" n="herdsPig" class="c2"><#if item.herdsPig??>${item.herdsPig}</#if></td>
        <td role="data" n="herdsNiu" class="c2"><#if item.herdsNiu??>${item.herdsNiu}</#if></td>
        <td role="data" n="herdsSheep" class="c2"><#if item.herdsSheep??>${item.herdsSheep}</#if></td>
        <td role="data" n="herdsOther" class="c2"><#if item.herdsOther??>${item.herdsOther}</#if></td>
        <td role="data" n="herdsChicken" class="c2"><#if item.herdsChicken??>${item.herdsChicken}</#if></td>
        <td role="data" n="herdsDuck" class="c2"><#if item.herdsDuck??>${item.herdsDuck}</#if></td>
        <td role="data" n="herdsGoose" class="c2"><#if item.herdsGoose??>${item.herdsGoose}</#if></td>
        <td role="data" n="herdsOtherQ" class="c2"><#if item.herdsOtherQ??>${item.herdsOtherQ}</#if></td>
        <td role="data" n="immuneBirdFluChecken"
            class="c2"><#if item.immuneBirdFluChecken??>${item.immuneBirdFluChecken}</#if></td>
        <td role="data" n="immuneBirdFluDuck"
            class="c2"><#if item.immuneBirdFluDuck??>${item.immuneBirdFluDuck}</#if></td>
        <td role="data" n="immuneBirdFluGoose"
            class="c2"><#if item.immuneBirdFluGoose??>${item.immuneBirdFluGoose}</#if></td>
        <td role="data" n="immuneBirdFluOther"
            class="c2"><#if item.immuneBirdFluOther??>${item.immuneBirdFluOther}</#if></td>
        <td role="data" n="immuneAfmdNiu" class="c2"><#if item.immuneAfmdNiu??>${item.immuneAfmdNiu}</#if></td>
        <td role="data" n="immuneAfmdSheep"
            class="c2"><#if item.immuneAfmdSheep??>${item.immuneAfmdSheep}</#if></td>
        <td role="data" n="immuneBlueEar" class="c2"><#if item.immuneBlueEar??>${item.immuneBlueEar}</#if></td>
        <td role="data" n="immuneSwine" class="c2"><#if item.immuneSwine??>${item.immuneSwine}</#if></td>
        <td role="data" n="immuneNewCastle"
            class="c2"><#if item.immuneNewCastle??>${item.immuneNewCastle}</#if></td>
        <td role="data" n="immuneFmdPig" class="c2"><#if item.immuneFmdPig??>${item.immuneFmdPig}</#if></td>
        <td role="data" n="immuneFmdNiu" class="c2"><#if item.immuneFmdNiu??>${item.immuneFmdNiu}</#if></td>
        <td role="data" n="immuneFmdSheep" class="c2"><#if item.immuneFmdSheep??>${item.immuneFmdSheep}</#if></td>
        <td role="data" n="immuneFmdOther" class="c2"><#if item.immuneFmdOther??>${item.immuneFmdOther}</#if></td>
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
                })
                var oldText = $(this).text()
                $(this).empty()
                var input = $('<input style="height: 100%;width:100%;" type="text" name="' + n + '" value="' + oldText + '">')
                input.on("blur",function(e){
                    var v = $(this).val()
                    $(this).parent("td").html(v)
                })
                $(this).append(input);
                input.focus();
                e.stopPropagation();
            })
        })
    })(jQuery, window, document)
</script>
