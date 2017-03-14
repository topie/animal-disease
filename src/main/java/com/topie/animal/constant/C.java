package com.topie.animal.constant;

/**
 * Created by chenguojun on 2017/3/14.
 */
public class C {

    public static final String SPEC_FILL_SCRIPT =
            "<script type=\"text/javascript\">\n" + "    (function ($, window, document, undefined) {\n"
                    + "        $(\"td\").each(function (i, d) {\n" + "            var n = $(this).attr(\"n\")\n"
                    + "            $(this).off(\"click\")\n" + "            $(this).on(\"click\", function (e) {\n"
                    + "                $(\"td\").each(function (e) {\n"
                    + "                    $(this).attr(\"current\", 0)\n" + "                })\n"
                    + "                $(this).attr(\"current\", 1)\n"
                    + "                $(\"td[current=0]\").find(\"input\").each(function (e) {\n"
                    + "                    var v = $(this).val()\n"
                    + "                    $(this).parent(\"td\").html(v)\n" + "                })\n"
                    + "                var oldText = $(this).text()\n" + "                $(this).empty()\n"
                    + "                var input = $('<input style=\"height: 100%;width:100%;\" type=\"text\" name=\"' + n + '\" value=\"' + oldText + '\">')\n"
                    + "                input.on(\"blur\", function (e) {\n"
                    + "                    var v = $(this).val()\n"
                    + "                    $(this).parent(\"td\").html(v)\n" + "                })\n"
                    + "                input.on(\"click\", function (e) {\n"
                    + "                    e.stopPropagation()\n" + "                })\n"
                    + "                $(this).append(input);\n" + "                input.focus()\n"
                    + "                e.stopPropagation()\n" + "            })\n" + "        })\n"
                    + "    })(jQuery, window, document)\n" + "</script>";
}
