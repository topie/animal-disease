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

</style>
<table class="t1">
    <colgroup>
        <col width="86">
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
        <td class="c1" colspan="22">畜禽存栏和应免数量月报表</td>
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
        <td class="c2">${item.livRegionname}</td>
        <td n="herdspig" class="c2"><#if item.herdspig??>${item.herdspig}</#if></td>
        <td n="herdsniu" class="c2"><#if item.herdsniu??>${item.herdsniu}</#if></td>
        <td n="herdssheep" class="c2"><#if item.herdssheep??>${item.herdssheep}</#if></td>
        <td n="herdsother" class="c2"><#if item.herdsother??>${item.herdsother}</#if></td>
        <td n="herdschicken" class="c2"><#if item.herdschicken??>${item.herdschicken}</#if></td>
        <td n="herdsduck" class="c2"><#if item.herdsduck??>${item.herdsduck}</#if></td>
        <td n="herdsgoose" class="c2"><#if item.herdsgoose??>${item.herdsgoose}</#if></td>
        <td n="herdsotherq" class="c2"><#if item.herdsotherq??>${item.herdsotherq}</#if></td>
        <td n="immunebirdfluchecken"
            class="c2"><#if item.immunebirdfluchecken??>${item.immunebirdfluchecken}</#if></td>
        <td n="immunebirdfluduck"
            class="c2"><#if item.immunebirdfluduck??>${item.immunebirdfluduck}</#if></td>
        <td n="immunebirdflugoose"
            class="c2"><#if item.immunebirdflugoose??>${item.immunebirdflugoose}</#if></td>
        <td n="immunebirdfluother"
            class="c2"><#if item.immunebirdfluother??>${item.immunebirdfluother}</#if></td>
        <td n="immuneafmdniu" class="c2"><#if item.immuneafmdniu??>${item.immuneafmdniu}</#if></td>
        <td n="immuneafmdsheep"
            class="c2"><#if item.immuneafmdsheep??>${item.immuneafmdsheep}</#if></td>
        <td n="immuneblueear" class="c2"><#if item.immuneblueear??>${item.immuneblueear}</#if></td>
        <td n="immuneswine" class="c2"><#if item.immuneswine??>${item.immuneswine}</#if></td>
        <td n="immunenewcastle"
            class="c2"><#if item.immunenewcastle??>${item.immunenewcastle}</#if></td>
        <td n="immunefmdpig" class="c2"><#if item.immunefmdpig??>${item.immunefmdpig}</#if></td>
        <td n="immunefmdniu" class="c2"><#if item.immunefmdniu??>${item.immunefmdniu}</#if></td>
        <td n="immunefmdsheep" class="c2"><#if item.immunefmdsheep??>${item.immunefmdsheep}</#if></td>
        <td n="immunefmdother" class="c2"><#if item.immunefmdother??>${item.immunefmdother}</#if></td>
    </tr>
    </#list>
    </tbody>
</table>

