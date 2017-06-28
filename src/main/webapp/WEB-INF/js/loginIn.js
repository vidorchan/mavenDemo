$(function() {
    /**
     * 约定文本框数据检查
     */
    $.extend($.fn.textbox.defaults.rules, {
        number: {
            validator: function (value, param) {
                return /^[0-9]*$/.test(value);
            },
            message: "请输入数字"
        },
        chinese: {
            validator: function (value, param) {
                var reg = /^[\u4e00-\u9fa5]+$/i;
                return reg.test(value);
            },
            message: "请输入中文"
        },
        checkLength: {
            validator: function (value, param) {
                return param[0] >= get_length(value);
            },
            message: '请输入最大{0}位字符'
        },
        specialCharacter: {
            validator: function (value, param) {
                var reg = new RegExp("[`~!@#$^&*()=|{}':;'\\[\\]<>~！@#￥……&*（）——|{}【】‘；：”“'、？]");
                return !reg.test(value);
            },
            message: '不允许输入特殊字符'
        },
        englishLowerCase: {// 验证英语小写
            validator: function (value) {
                return /^[a-z]+$/.test(value);
            },
            message: '请输入小写字母'
        }
    });

    var viewLeft = $('#viewer').css('left');
    var leftVal  = Number(viewLeft.substr(0,viewLeft.indexOf('p')));

    $('#pass').passwordbox({
        inputEvents: $.extend({}, $.fn.passwordbox.defaults.inputEvents, {
            keypress: function (e) {
                var char = String.fromCharCode(e.which);
                $('#viewer').html(char);
                $('#viewer').css('left', leftVal + 10 * $('#pass').val().length + 'px');
                $('#viewer').fadeIn(200, function () {
                    $(this).fadeOut();
                });
            }
        })
    });
});