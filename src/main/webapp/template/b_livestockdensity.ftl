<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
.b1 {
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
	height: 16.5pt;
}

.r3 {
	height: 28.5pt;
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
	color: black;
	font-size: 10pt;
}

.c5 {
	white-space: pre-wrap;
	text-align: center;
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
	border-right: thin solid black;
	border-bottom: thin solid black;
	color: black;
	font-size: 10pt;
}
</style>
</head>
<body class="b1">

	<table class="t1">
		<colgroup>
			<col width="87">
			<col width="60">
			<col width="58">
			<col width="58">
			<col width="61">
			<col width="60">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="59">
			<col width="66">
			<col width="66">
			<col width="60">
			<col width="59">
			<col width="65">
			<col width="58">
			<col width="58">
			<col width="66">
			<col width="58">
			<col width="66">
			<col width="58">
			<col width="66">
			<col width="58">
			<col width="60">
			<col width="66">
			<col width="59">
			<col width="66">
		</colgroup>
		<tbody>
			<tr class="r1">
				<td class="c1" colspan="35">${templateName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">单 位:</td>
				<td class="c3" colspan="34">${org.orgName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">填表日期:</td>
				<td class="c3" colspan="34"><#if item.ldDate??>${item.ldDate?string("yyyy-MM-dd")}</#if></td>
			</tr>
			<tr class="r2">
				<td class="c2">填 表 人:</td>
				<td class="c3" colspan="34">${user.realName}</td>
			</tr>
			<tr class="r2">
				<td class="c2">主管领导：</td>
				<td class="c3" colspan="34">${user.leaderName}</td>
			</tr>
			<tr class="r3">
				<td class="c2" colspan="7">猪(万头)</td>
				<td class="c5" colspan="7">牛（含奶牛）(万头)</td>
				<td class="c2" colspan="3">奶牛(万头)</td>
				<td class="c2" colspan="11">羊(万只)</td>
				<td class="c2" colspan="7">其它(万头/只)</td>
			</tr>
			<tr class="r3">
				<td class="c2" rowspan="2">存栏数量</td>
				<td class="c2" colspan="2">O型口蹄疫</td>
				<td class="c2" colspan="2">高致病性猪蓝耳病</td>
				<td class="c2" colspan="2">猪瘟</td>
				<td class="c2" rowspan="2">存栏数量</td>
				<td class="c2" colspan="2">O型-亚洲I型口蹄疫</td>
				<td class="c5" colspan="2">A型口蹄疫</td>

                <td class="c5" colspan="2">布鲁氏菌病</td>

				<td class="c6" rowspan="2">存栏数量</td>
				<td class="c2" colspan="2">A型口蹄疫</td>
				<td class="c2" rowspan="2">存栏数量</td>
				<td class="c2" colspan="2">O型-亚洲I型口蹄疫</td>
				<td class="c2" colspan="2">A型口蹄疫</td>
				<td class="c2" colspan="2">小反刍兽疫</td>

                <td class="c5" colspan="2">布鲁氏菌病</td>
                <td class="c5" colspan="2">包虫病</td>

				<td class="c2" rowspan="2">存栏情况</td>
				<td class="c2" colspan="2">O型口蹄疫</td>
				<td class="c2" colspan="2">O型-亚洲I型口蹄疫</td>

                <td class="c2" colspan="2">A型口蹄疫</td>
			</tr>
			<tr class="r3">
                <td class="c2">应免数量</td>
                <td class="c2">实际免疫数量</td>
                <td class="c2">应免数量</td>
                <td class="c2">实际免疫数量</td>
                <td class="c2">应免数量</td>
                <td class="c2">实际免疫数量</td>
                <td class="c2">应免数量</td>
                <td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
				<td class="c2">应免数量</td>
				<td class="c2">实际免疫数量</td>
			</tr>
			<tr class="r4">
				<td role="data" n="ldPidherdscount"  class="c2"><#if item.ldPidherdscount??>${item.ldPidherdscount}</#if></td>
				<td role="data" n="ldPigoshuldcount"   class="c2"><#if item.ldPigoshuldcount??>${item.ldPigoshuldcount}</#if></td>
				<td role="data" n="ldPigoactualcount"   class="c2"><#if item.ldPigoactualcount??>${item.ldPigoactualcount}</#if></td>
				<td role="data" n="ldPigbshuldcount"   class="c2"><#if item.ldPigbshuldcount??>${item.ldPigbshuldcount}</#if></td>
				<td role="data" n="ldPigbactualcount"   class="c2"><#if item.ldPigbactualcount??>${item.ldPigbactualcount}</#if></td>
				<td role="data" n="ldPigcshuldcount"   class="c2"><#if item.ldPigcshuldcount??>${item.ldPigcshuldcount}</#if></td>
				<td role="data" n="ldPigcactualcount"   class="c2"><#if item.ldPigcactualcount??>${item.ldPigcactualcount}</#if></td>
				
				<td role="data" n="ldNiuherdscount"   class="c2"><#if item.ldNiuherdscount??>${item.ldNiuherdscount}</#if></td>
				<td role="data" n="ldNiushuldcount"   class="c2"><#if item.ldNiushuldcount??>${item.ldNiushuldcount}</#if></td>
				<td role="data" n="ldNiuactualcount"   class="c2"><#if item.ldNiuactualcount??>${item.ldNiuactualcount}</#if></td>
				<td role="data" n="ldNiuashuldcount"   class="c2"><#if item.ldNiuashuldcount??>${item.ldNiuashuldcount}</#if></td>
				<td role="data" n="ldNiuaactualcount"   class="c2"><#if item.ldNiuaactualcount??>${item.ldNiuaactualcount}</#if></td>

                <td role="data" n="ldNiuBruShuldCount"   class="c2"><#if item.ldNiuBruShuldCount??>${item.ldNiuBruShuldCount}</#if></td>
                <td role="data" n="ldNiuBruActualCount"   class="c2"><#if item.ldNiuBruActualCount??>${item.ldNiuBruActualCount}</#if></td>
				
				<td role="data" n="ldCowherdscount"   class="c2"><#if item.ldCowherdscount??>${item.ldCowherdscount}</#if></td>
				<td role="data" n="ldCowshuldcount"   class="c2"><#if item.ldCowshuldcount??>${item.ldCowshuldcount}</#if></td>
				<td role="data" n="ldCowactualcount"   class="c2"><#if item.ldCowactualcount??>${item.ldCowactualcount}</#if></td>
				
				<td role="data" n="ldSheepherdscount"   class="c2"><#if item.ldSheepherdscount??>${item.ldSheepherdscount}</#if></td>
				<td role="data" n="ldSheeposhuldcount"   class="c2"><#if item.ldSheeposhuldcount??>${item.ldSheeposhuldcount}</#if></td>
				<td role="data" n="ldSheepoactualcount"   class="c2"><#if item.ldSheepoactualcount??>${item.ldSheepoactualcount}</#if></td>
				<td role="data" n="ldSheepashuldcount"   class="c2"><#if item.ldSheepashuldcount??>${item.ldSheepashuldcount}</#if></td>
				<td role="data" n="ldSheepaactualcount"   class="c2"><#if item.ldSheepaactualcount??>${item.ldSheepaactualcount}</#if></td>
				<td role="data" n="ldSheeppdprshuldcount"   class="c2"><#if item.ldSheeppdprshuldcount??>${item.ldSheeppdprshuldcount}</#if></td>
				<td role="data" n="ldSheeppdpractualcount"   class="c2"><#if item.ldSheeppdpractualcount??>${item.ldSheeppdpractualcount}</#if></td>

                <td role="data" n="ldSheepBruShuldCount"   class="c2"><#if item.ldSheepBruShuldCount??>${item.ldSheepBruShuldCount}</#if></td>
                <td role="data" n="ldSheepBruActualCount"   class="c2"><#if item.ldSheepBruActualCount??>${item.ldSheepBruActualCount}</#if></td>
                <td role="data" n="ldSheepEchShuldCount"   class="c2"><#if item.ldSheepEchShuldCount??>${item.ldSheepEchShuldCount}</#if></td>
                <td role="data" n="ldSheepEchActualCount"   class="c2"><#if item.ldSheepEchActualCount??>${item.ldSheepEchActualCount}</#if></td>
				
				<td role="data" n="ldOtherherdscount"   class="c2"><#if item.ldOtherherdscount??>${item.ldOtherherdscount}</#if></td>
				<td role="data" n="ldOtheroshuldcount"   class="c2"><#if item.ldOtheroshuldcount??>${item.ldOtheroshuldcount}</#if></td>
				<td role="data" n="ldOtheroactualcount"   class="c2"><#if item.ldOtheroactualcount??>${item.ldOtheroactualcount}</#if></td>
				<td role="data" n="ldOtheroishuldcount"   class="c2"><#if item.ldOtheroishuldcount??>${item.ldOtheroishuldcount}</#if></td>
				<td role="data" n="ldOtheroiactualcount"   class="c2"><#if item.ldOtheroiactualcount??>${item.ldOtheroiactualcount}</#if></td>

                <td role="data" n="ldOtherFmdaShuldCount"   class="c2"><#if item.ldOtherFmdaShuldCount??>${item.ldOtherFmdaShuldCount}</#if></td>
                <td role="data" n="ldOtherFmdaActualCount"   class="c2"><#if item.ldOtherFmdaActualCount??>${item.ldOtherFmdaActualCount}</#if></td>
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
