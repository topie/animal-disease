<html>
<head>
    <META http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">.b1{white-space-collapsing:preserve;}
    .t1{border-collapse:collapse;border-spacing:0;}
    .r1{height:22.5pt;}
    .r2{height:16.5pt;}
    .r3{height:15.0pt;}
    .r4{height:32.25pt;}
    .r5{height:21.0pt;}
    .r6{height:24.0pt;}
    .c1{white-space:pre-wrap;text-align:center;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:16pt;}
    .c2{white-space:pre-wrap;text-align:center;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;color: black; font-size:10pt;}
    .c3{white-space:pre-wrap;text-align:left;border-top:thin solid black;border-right:thin solid black;border-bottom:thin solid black;border-left:thin solid black;font-size:10pt;}
    </style>
</head>
<body class="b1">
<table class="t1">
    <colgroup>
        <col width="105">
        <col width="157">
        <col width="67">
        <col width="96">
        <col width="113">
        <col width="90">
        <col width="156">
        <col width="56">
        <col width="112">
        <col width="116">
        <col width="81">
        <col width="123">
        <col width="56">
        <col width="1">
        <col width="99">
        <col width="110">
    </colgroup>
    <tbody>
    <tr class="r1">
        <td class="c1" colspan="15">${templateName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">单   位:</td>
        <td class="c3" colspan="14">${org.orgName}</td>
    </tr>
    <tr class="r2">
        <td class="c2">填表日期:</td>
        <td class="c3" colspan="14"><#if report.reportTime??>${report.reportTime?string("yyyy-MM-dd")}</#if></td>
    </tr>
    <tr class="r2">
        <td class="c2">填 表 人:</td>
        <td class="c3" colspan="14">${user.realName}</td>
    </tr>
    <tr class="r3">
        <td class="c2">主管领导：</td>
        <td class="c3" colspan="14">${user.leaderName}</td>
    </tr>
    <tr class="r4">
        <td class="c2" colspan="5">全省上半年落实动物疫病防控经费（万元）</td>
        <td class="c2" colspan="5">全省春防落实动物疫病防控经费（万元）</td>
        <td class="c2" colspan="5">省本级春防落实动物疫病防控经费（万元）</td>
    </tr>
    <tr class="r5">
        <td class="c2" colspan="3">强制免疫补助经费</td>
        <td class="c2" rowspan="2">强制扑杀补助经费</td>
        <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
        <td class="c2" colspan="3">强制免疫补助经费</td>
        <td class="c2" rowspan="2">强制扑杀补助经费</td>
        <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
        <td class="c2" colspan="3">强制免疫补助经费</td>
        <td class="c2" rowspan="2">强制扑杀补助经费</td>
        <td class="c2" rowspan="2">养殖环节无害化处理补助经费</td>
    </tr>
    <tr class="r6">
        <td class="c2">疫苗配套经费</td>
        <td class="c2">购买、实施动物防疫服务经费</td>
        <td class="c2">其它</td>
        <td class="c2">疫苗配套经费</td>
        <td class="c2">购买、实施动物防疫服务经费</td>
        <td class="c2">其它</td>
        <td class="c2">疫苗配套经费</td>
        <td class="c2">购买动物防疫服务经费</td>
        <td class="c2">其它</td>
    </tr>
    <tr class="r2">
        <td role="data" n="kfYearympt"   class="c2"><#if item.kfYearympt??>${item.kfYearympt}</#if></td>
        <td role="data" n="kfYearfyfw"   class="c2"><#if item.kfYearfyfw??>${item.kfYearfyfw}</#if></td>
        <td role="data" n="kfYearother"   class="c2"><#if item.kfYearother??>${item.kfYearother}</#if></td>
        <td role="data" n="kfYearqzps"   class="c2"><#if item.kfYearqzps??>${item.kfYearqzps}</#if></td>
        <td role="data" n="kfYearwhhcl"   class="c2"><#if item.kfYearwhhcl??>${item.kfYearwhhcl}</#if></td>
        <td role="data" n="kfAllshengympt"   class="c2"><#if item.kfAllshengympt??>${item.kfAllshengympt}</#if></td>
        <td role="data" n="kfAllshengfyfw"   class="c2"><#if item.kfAllshengfyfw??>${item.kfAllshengfyfw}</#if></td>
        <td role="data" n="kfAllshengother"   class="c2"><#if item.kfAllshengother??>${item.kfAllshengother}</#if></td>
        <td role="data" n="kfAllshengqzps"   class="c2"><#if item.kfAllshengqzps??>${item.kfAllshengqzps}</#if></td>
        <td role="data" n="kfAllshengwhhcl"   class="c2"><#if item.kfAllshengwhhcl??>${item.kfAllshengwhhcl}</#if></td>
        <td role="data" n="kfShengympt"   class="c2"><#if item.kfShengympt??>${item.kfShengympt}</#if></td>
        <td role="data" n="kfShengfyfw"   class="c2"><#if item.kfShengfyfw??>${item.kfShengfyfw}</#if></td>
        <td role="data" n="kfShengother"   class="c2"><#if item.kfShengother??>${item.kfShengother}</#if></td>
        <td role="data" n="kfShengqzps"   class="c2"><#if item.kfShengqzps??>${item.kfShengqzps}</#if></td>
        <td role="data" n="kfShengwhhcl"   class="c2"><#if item.kfShengwhhcl??>${item.kfShengwhhcl}</#if></td>
    </tr>
    <tr class="r3">
        <td class="c3" colspan="15">备注：全省上半年落实动物疫病防控经费指的是省级、市级、县级上半年配套经费，全省春防落实动物疫病防控经费指的省级、市级、县级春防配套经费，省本级春防落实动物疫病防控经费指的是省级春防配套经费。</td>
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
