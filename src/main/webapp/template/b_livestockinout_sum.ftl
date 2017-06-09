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
        <td class="c1" colspan="26">${templateName}</td>
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
        <td class="c2">小反刍兽疫应免数量（万只）</td>
        <td class="c2" colspan="2">布鲁氏菌病应免数量（万头/只）</td>
        <td class="c2">包虫病应免数量（万只）</td>
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
        <td class="c2">羊</td>
        <td class="c2">牛</td>
        <td class="c2">羊</td>
        <td class="c2">羊</td>
    </tr>
    <#assign herdspigSum=0>
    <#assign herdsniuSum=0>
    <#assign herdssheepSum=0>
    <#assign herdsotherSum=0>
    <#assign herdschickenSum=0>
    <#assign herdsduckSum=0>
    <#assign herdsgooseSum=0>
    <#assign herdsotherqSum=0>
    <#assign immunefmdpigSum=0>
    <#assign immunefmdniuSum=0>
    <#assign immunefmdsheepSum=0>
    <#assign immunefmdotherSum=0>
    <#assign immunebirdflucheckenSum=0>
    <#assign immunebirdfluduckSum=0>
    <#assign immunebirdflugooseSum=0>
    <#assign immunebirdfluotherSum=0>
    <#assign immuneafmdniuSum=0>
    <#assign immuneafmdsheepSum=0>
    <#assign immuneblueearSum=0>
    <#assign immuneswineSum=0>
    <#assign immunenewcastleSum=0>

    <#assign immuneaPprSheepSum=0>
    <#assign immuneBruniuSum=0>
    <#assign immuneBruSheepSum=0>
    <#assign immuneEchSheepSum=0>
    <#list items as item>
        <#assign herdspigSum=herdspigSum?default(0) +item.herdspig?default(0)>
        <#assign herdsniuSum=herdsniuSum?default(0) +item.herdsniu?default(0)>
        <#assign herdssheepSum=herdssheepSum?default(0) +item.herdssheep?default(0)>
        <#assign herdsotherSum=herdsotherSum?default(0) +item.herdsother?default(0)>
        <#assign herdschickenSum=herdschickenSum?default(0) +item.herdschicken?default(0)>
        <#assign herdsduckSum=herdsduckSum?default(0) +item.herdsduck?default(0)>
        <#assign herdsgooseSum=herdsgooseSum?default(0) +item.herdsgoose?default(0)>
        <#assign herdsotherqSum=herdsotherqSum?default(0) +item.herdsotherq?default(0)>
        <#assign immunefmdpigSum=immunefmdpigSum?default(0) +item.immunefmdpig?default(0)>
        <#assign immunefmdniuSum=immunefmdniuSum?default(0) +item.immunefmdniu?default(0)>
        <#assign immunefmdsheepSum=immunefmdsheepSum?default(0) +item.immunefmdsheep?default(0)>
        <#assign immunefmdotherSum=immunefmdotherSum?default(0) +item.immunefmdother?default(0)>
        <#assign immunebirdflucheckenSum=immunebirdflucheckenSum?default(0) +item.immunebirdfluchecken?default(0)>
        <#assign immunebirdfluduckSum=immunebirdfluduckSum?default(0) +item.immunebirdfluduck?default(0)>
        <#assign immunebirdflugooseSum=immunebirdflugooseSum?default(0) +item.immunebirdflugoose?default(0)>
        <#assign immunebirdfluotherSum=immunebirdfluotherSum?default(0) +item.immunebirdfluother?default(0)>
        <#assign immuneafmdniuSum=immuneafmdniuSum?default(0) +item.immuneafmdniu?default(0)>
        <#assign immuneafmdsheepSum=immuneafmdsheepSum?default(0) +item.immuneafmdsheep?default(0)>
        <#assign immuneblueearSum=immuneblueearSum?default(0) +item.immuneblueear?default(0)>
        <#assign immuneswineSum=immuneswineSum?default(0) +item.immuneswine?default(0)>
    
        <#assign immunenewcastleSum=immunenewcastleSum?default(0) +item.immunenewcastle?default(0)>

        <#assign immuneaPprSheepSum=immuneaPprSheepSum?default(0) +item.immuneaPprSheep?default(0)>
        <#assign immuneBruniuSum=immuneBruniuSum?default(0) +item.immuneBruniu?default(0)>
        <#assign immuneBruSheepSum=immuneBruSheepSum?default(0) +item.immuneBruSheep?default(0)>
        <#assign immuneEchSheepSum=immuneEchSheepSum?default(0) +item.immuneEchSheep?default(0)>

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
        <td n="immunefmdpig" class="c2"><#if item.immunefmdpig??>${item.immunefmdpig}</#if></td>
        <td n="immunefmdniu" class="c2"><#if item.immunefmdniu??>${item.immunefmdniu}</#if></td>
        <td n="immunefmdsheep" class="c2"><#if item.immunefmdsheep??>${item.immunefmdsheep}</#if></td>
        <td n="immunefmdother" class="c2"><#if item.immunefmdother??>${item.immunefmdother}</#if></td>
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

        <td n="immuneaPprSheep" class="c2"><#if item.immuneaPprSheep??>${item.immuneaPprSheep}</#if></td>
        <td n="immuneBruniu" class="c2"><#if item.immuneBruniu??>${item.immuneBruniu}</#if></td>
        <td n="immuneBruSheep" class="c2"><#if item.immuneBruSheep??>${item.immuneBruSheep}</#if></td>
        <td n="immuneEchSheep"  class="c2"><#if item.immuneEchSheep??>${item.immuneEchSheep}</#if></td>
    </tr>
    </#list>
    <tr class="r3">
        <td  class="c2">合计</td>
        <td n="herdspigSum" class="c2"><#if herdspigSum??>${herdspigSum}</#if></td>
        <td n="herdsniuSum" class="c2"><#if herdsniuSum??>${herdsniuSum}</#if></td>
        <td n="herdssheepSum" class="c2"><#if herdssheepSum??>${herdssheepSum}</#if></td>
        <td n="herdsotherSum" class="c2"><#if herdsotherSum??>${herdsotherSum}</#if></td>
        <td n="herdschickenSum" class="c2"><#if herdschickenSum??>${herdschickenSum}</#if></td>
        <td n="herdsduckSum" class="c2"><#if herdsduckSum??>${herdsduckSum}</#if></td>
        <td n="herdsgooseSum" class="c2"><#if herdsgooseSum??>${herdsgooseSum}</#if></td>
        <td n="herdsotherqSum" class="c2"><#if herdsotherqSum??>${herdsotherqSum}</#if></td>
        <td n="immunefmdpigSum" class="c2"><#if immunefmdpigSum??>${immunefmdpigSum}</#if></td>
        <td n="immunefmdniuSum" class="c2"><#if immunefmdniuSum??>${immunefmdniuSum}</#if></td>
        <td n="immunefmdsheepSum" class="c2"><#if immunefmdsheepSum??>${immunefmdsheepSum}</#if></td>
        <td n="immunefmdotherSum" class="c2"><#if immunefmdotherSum??>${immunefmdotherSum}</#if></td>
        <td n="immunebirdflucheckenSum" class="c2"><#if immunebirdflucheckenSum??>${immunebirdflucheckenSum}</#if></td>
        <td n="immunebirdfluduckSum" class="c2"><#if immunebirdfluduckSum??>${immunebirdfluduckSum}</#if></td>
        <td n="immunebirdflugooseSum" class="c2"><#if immunebirdflugooseSum??>${immunebirdflugooseSum}</#if></td>
        <td n="immunebirdfluotherSum" class="c2"><#if immunebirdfluotherSum??>${immunebirdfluotherSum}</#if></td>
        <td n="immuneafmdniuSum" class="c2"><#if immuneafmdniuSum??>${immuneafmdniuSum}</#if></td>
        <td n="immuneafmdsheepSum" class="c2"><#if immuneafmdsheepSum??>${immuneafmdsheepSum}</#if></td>
        <td n="immuneblueearSum" class="c2"><#if immuneblueearSum??>${immuneblueearSum}</#if></td>
        <td n="immuneswineSum" class="c2"><#if immuneswineSum??>${immuneswineSum}</#if></td>
        <td n="immunenewcastleSum" class="c2"><#if immunenewcastleSum??>${immunenewcastleSum}</#if></td>

        <td n="immuneaPprSheepSum" class="c2"><#if immuneaPprSheepSum??>${immuneaPprSheepSum}</#if></td>
        <td n="immuneBruniuSum" class="c2"><#if immuneBruniuSum??>${immuneBruniuSum}</#if></td>
        <td n="immuneBruSheepSum" class="c2"><#if immuneBruSheepSum??>${immuneBruSheepSum}</#if></td>
        <td n="immuneEchSheepSum" class="c2"><#if immuneEchSheepSum??>${immuneEchSheepSum}</#if></td>


    </tr>
    </tbody>
</table>

