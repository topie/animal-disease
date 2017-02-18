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
    height: 64.5pt;
}

.r3 {
    height: 15.0pt;
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
    border-top: thin solid black;
    border-right: thin solid black;
    border-bottom: thin solid black;
    color: black;
    font-size: 10pt;
}

.c5 {
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
        <col width="76">
        <col width="47">
        <col width="51">
        <col width="52">
        <col width="58">
        <col width="48">
        <col width="50">
        <col width="44">
        <col width="50">
        <col width="51">
        <col width="50">
        <col width="50">
        <col width="65">
        <col width="45">
        <col width="45">
        <col width="45">
        <col width="58">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
        <col width="66">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="22">畜禽存栏和应免数量月报表 （2017年1月）</td>
    </tr>
    <tr class="r2">
        <td class="c2" rowspan="2">省份</td>
        <td class="c2" colspan="8">当月存栏数量(万头/只/羽)</td>
        <td class="c2" colspan="4">牲畜口蹄疫当月应免数量(万头/只)</td>
        <td class="c2" colspan="4">禽流感当月应免数量(万羽)</td>
        <td class="c2" colspan="2">A型口蹄疫当月应免数量(万头/只)</td>
        <td class="c2">高致病性猪蓝耳病当月应免数量(万头)</td>
        <td class="c2">猪瘟当月应免数量(万头)</td>
        <td class="c2">新城疫当月应免数量(万羽)</td>
    </tr>
    <tr class="r3">
        <td class="c2">猪</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">其它动物</td>
        <td class="c2">鸡</td>
        <td class="c2">鸭</td>
        <td class="c2">鹅</td>
        <td class="c3">其它禽</td>
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
    <#list items as item>
    <tr class="r3">
        <td class="c2">${item.province}</td>
        <td n="herdsPig" class="c2"><#if item.herdsPig??>${item.herdsPig}</#if></td>
        <td n="herdsNiu" class="c2"><#if item.herdsNiu??>${item.herdsNiu}</#if></td>
        <td n="herdsSheep" class="c2"><#if item.herdsSheep??>${item.herdsSheep}</#if></td>
        <td n="herdsOther" class="c2"><#if item.herdsOther??>${item.herdsOther}</#if></td>
        <td n="herdsChicken" class="c2"><#if item.herdsChicken??>${item.herdsChicken}</#if></td>
        <td n="herdsDuck" class="c2"><#if item.herdsDuck??>${item.herdsDuck}</#if></td>
        <td n="herdsGoose" class="c2"><#if item.herdsGoose??>${item.herdsGoose}</#if></td>
        <td n="herdsOtherQ" class="c2"><#if item.herdsOtherQ??>${item.herdsOtherQ}</#if></td>
        <td n="immuneBirdFluChecken"
            class="c2"><#if item.immuneBirdFluChecken??>${item.immuneBirdFluChecken}</#if></td>
        <td n="immuneBirdFluDuck"
            class="c2"><#if item.immuneBirdFluDuck??>${item.immuneBirdFluDuck}</#if></td>
        <td n="immuneBirdFluGoose"
            class="c2"><#if item.immuneBirdFluGoose??>${item.immuneBirdFluGoose}</#if></td>
        <td n="immuneBirdFluOther"
            class="c2"><#if item.immuneBirdFluOther??>${item.immuneBirdFluOther}</#if></td>
        <td n="immuneAfmdNiu" class="c2"><#if item.immuneAfmdNiu??>${item.immuneAfmdNiu}</#if></td>
        <td n="immuneAfmdSheep"
            class="c2"><#if item.immuneAfmdSheep??>${item.immuneAfmdSheep}</#if></td>
        <td n="immuneBlueEar" class="c2"><#if item.immuneBlueEar??>${item.immuneBlueEar}</#if></td>
        <td n="immuneSwine" class="c2"><#if item.immuneSwine??>${item.immuneSwine}</#if></td>
        <td n="immuneNewCastle"
            class="c2"><#if item.immuneNewCastle??>${item.immuneNewCastle}</#if></td>
        <td n="immuneFmdPig" class="c2"><#if item.immuneFmdPig??>${item.immuneFmdPig}</#if></td>
        <td n="immuneFmdNiu" class="c2"><#if item.immuneFmdNiu??>${item.immuneFmdNiu}</#if></td>
        <td n="immuneFmdSheep" class="c2"><#if item.immuneFmdSheep??>${item.immuneFmdSheep}</#if></td>
        <td n="immuneFmdOther" class="c2"><#if item.immuneFmdOther??>${item.immuneFmdOther}</#if></td>
    </tr>
    </#list>
    <tr class="r4">
        <td class="c2">汇总</td>
        <td n="herdsPig" class="c2"><#if sum.herdsPig??>${sum.herdsPig}</#if></td>
        <td n="herdsNiu" class="c2"><#if sum.herdsNiu??>${sum.herdsNiu}</#if></td>
        <td n="herdsSheep" class="c2"><#if sum.herdsSheep??>${sum.herdsSheep}</#if></td>
        <td n="herdsOther" class="c2"><#if sum.herdsOther??>${sum.herdsOther}</#if></td>
        <td n="herdsChicken" class="c2"><#if sum.herdsChicken??>${sum.herdsChicken}</#if></td>
        <td n="herdsDuck" class="c2"><#if sum.herdsDuck??>${sum.herdsDuck}</#if></td>
        <td n="herdsGoose" class="c2"><#if sum.herdsGoose??>${sum.herdsGoose}</#if></td>
        <td n="herdsOtherQ" class="c2"><#if sum.herdsOtherQ??>${sum.herdsOtherQ}</#if></td>
        <td n="immuneBirdFluChecken"
            class="c2"><#if sum.immuneBirdFluChecken??>${sum.immuneBirdFluChecken}</#if></td>
        <td n="immuneBirdFluDuck"
            class="c2"><#if sum.immuneBirdFluDuck??>${sum.immuneBirdFluDuck}</#if></td>
        <td n="immuneBirdFluGoose"
            class="c2"><#if sum.immuneBirdFluGoose??>${sum.immuneBirdFluGoose}</#if></td>
        <td n="immuneBirdFluOther"
            class="c2"><#if sum.immuneBirdFluOther??>${sum.immuneBirdFluOther}</#if></td>
        <td n="immuneAfmdNiu" class="c2"><#if sum.immuneAfmdNiu??>${sum.immuneAfmdNiu}</#if></td>
        <td n="immuneAfmdSheep"
            class="c2"><#if sum.immuneAfmdSheep??>${sum.immuneAfmdSheep}</#if></td>
        <td n="immuneBlueEar" class="c2"><#if sum.immuneBlueEar??>${sum.immuneBlueEar}</#if></td>
        <td n="immuneSwine" class="c2"><#if sum.immuneSwine??>${sum.immuneSwine}</#if></td>
        <td n="immuneNewCastle"
            class="c2"><#if sum.immuneNewCastle??>${sum.immuneNewCastle}</#if></td>
        <td n="immuneFmdPig" class="c2"><#if sum.immuneFmdPig??>${sum.immuneFmdPig}</#if></td>
        <td n="immuneFmdNiu" class="c2"><#if sum.immuneFmdNiu??>${sum.immuneFmdNiu}</#if></td>
        <td n="immuneFmdSheep" class="c2"><#if sum.immuneFmdSheep??>${sum.immuneFmdSheep}</#if></td>
        <td n="immuneFmdOther" class="c2"><#if sum.immuneFmdOther??>${sum.immuneFmdOther}</#if></td>
    </tr>
    </tbody>
</table>

