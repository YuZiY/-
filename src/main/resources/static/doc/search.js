let api = [];
const apiDocListSize = 1
api.push({
    name: 'default',
    order: '1',
    list: []
})
api[0].list.push({
    alias: 'AdminController',
    order: '1',
    link: '管理员',
    desc: '管理员',
    list: []
})
api[0].list[0].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/login',
    desc: '通过用户名登录',
});
api[0].list[0].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/loginByPhone',
    desc: '通过手机号登录',
});
api[0].list[0].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/registerByName',
    desc: '通过用户名注册',
});
api[0].list[0].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/registerByPhone',
    desc: '通过手机号注册',
});
api[0].list[0].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/reset',
    desc: '重置密码',
});
api[0].list[0].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/update',
    desc: '修改管理员用户',
});
api[0].list[0].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/delete/{admiId}',
    desc: '删除管理员用户',
});
api[0].list[0].list.push({
    order: '8',
    deprecated: 'false',
    url: 'http://10.9.5.133/admin/find',
    desc: '查找管理员用户id',
});
api[0].list.push({
    alias: 'GoodsController',
    order: '2',
    link: '商品',
    desc: '商品',
    list: []
})
api[0].list[1].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://10.9.5.133/goods/findGoodsByName',
    desc: '通过名字查找',
});
api[0].list[1].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://10.9.5.133/goods/findGoodsByType',
    desc: '通过类型查找',
});
api[0].list[1].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://10.9.5.133/goods/findGoodsByPrice',
    desc: '通过价格范围',
});
api[0].list[1].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://10.9.5.133/goods/addGoods',
    desc: '添加',
});
api[0].list[1].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://10.9.5.133/goods/deleteGoods/{goodId}',
    desc: '删除',
});
api[0].list.push({
    alias: 'OrderController',
    order: '3',
    link: '订单',
    desc: '订单',
    list: []
})
api[0].list[2].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://10.9.5.133/order/addOrder',
    desc: '从购物车中添加订单',
});
api[0].list[2].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://10.9.5.133/order/findAllOrder',
    desc: '查询订单',
});
api[0].list[2].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://10.9.5.133/order/updateOrder',
    desc: '支付方式',
});
api[0].list[2].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://10.9.5.133/order/deleteOrder/{orderId}',
    desc: '删除订单',
});
api[0].list[2].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://10.9.5.133/order/updateOrderStatus',
    desc: '修改订单状态',
});
api[0].list.push({
    alias: 'ShoppingCartController',
    order: '4',
    link: '购物车',
    desc: '购物车',
    list: []
})
api[0].list[3].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://10.9.5.133/shopping/addShoppingCart',
    desc: '添加购物车',
});
api[0].list[3].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://10.9.5.133/shopping/findAllShoppingCart',
    desc: '查询购物车',
});
api[0].list[3].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://10.9.5.133/shopping/updateShoppingCart',
    desc: '修改购物车数量',
});
api[0].list[3].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://10.9.5.133/shopping/deleteShoppingCart/{shoppingCartId}',
    desc: '删除购物车',
});
api[0].list.push({
    alias: 'UserController',
    order: '5',
    link: '用户',
    desc: '用户',
    list: []
})
api[0].list[4].list.push({
    order: '1',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/login',
    desc: '登录',
});
api[0].list[4].list.push({
    order: '2',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/registerByName',
    desc: '通过用户名注册',
});
api[0].list[4].list.push({
    order: '3',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/registerByPhone',
    desc: '通过手机号注册',
});
api[0].list[4].list.push({
    order: '4',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/reset',
    desc: '重置密码',
});
api[0].list[4].list.push({
    order: '5',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/updateUserById',
    desc: '修改用户信息',
});
api[0].list[4].list.push({
    order: '6',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/findAllUser',
    desc: '查询用户信息',
});
api[0].list[4].list.push({
    order: '7',
    deprecated: 'false',
    url: 'http://10.9.5.133/user/deleteUserById/{userId}',
    desc: '删除用户',
});
api[0].list.push({
    alias: 'error',
    order: '6',
    link: 'error_code_list',
    desc: '错误码列表',
    list: []
})
document.onkeydown = keyDownSearch;
function keyDownSearch(e) {
    const theEvent = e;
    const code = theEvent.keyCode || theEvent.which || theEvent.charCode;
    if (code == 13) {
        const search = document.getElementById('search');
        const searchValue = search.value.toLocaleLowerCase();

        let searchGroup = [];
        for (let i = 0; i < api.length; i++) {

            let apiGroup = api[i];

            let searchArr = [];
            for (let i = 0; i < apiGroup.list.length; i++) {
                let apiData = apiGroup.list[i];
                const desc = apiData.desc;
                if (desc.toLocaleLowerCase().indexOf(searchValue) > -1) {
                    searchArr.push({
                        order: apiData.order,
                        desc: apiData.desc,
                        link: apiData.link,
                        list: apiData.list
                    });
                } else {
                    let methodList = apiData.list || [];
                    let methodListTemp = [];
                    for (let j = 0; j < methodList.length; j++) {
                        const methodData = methodList[j];
                        const methodDesc = methodData.desc;
                        if (methodDesc.toLocaleLowerCase().indexOf(searchValue) > -1) {
                            methodListTemp.push(methodData);
                            break;
                        }
                    }
                    if (methodListTemp.length > 0) {
                        const data = {
                            order: apiData.order,
                            desc: apiData.desc,
                            link: apiData.link,
                            list: methodListTemp
                        };
                        searchArr.push(data);
                    }
                }
            }
            if (apiGroup.name.toLocaleLowerCase().indexOf(searchValue) > -1) {
                searchGroup.push({
                    name: apiGroup.name,
                    order: apiGroup.order,
                    list: searchArr
                });
                continue;
            }
            if (searchArr.length === 0) {
                continue;
            }
            searchGroup.push({
                name: apiGroup.name,
                order: apiGroup.order,
                list: searchArr
            });
        }
        let html;
        if (searchValue == '') {
            const liClass = "";
            const display = "display: none";
            html = buildAccordion(api,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        } else {
            const liClass = "open";
            const display = "display: block";
            html = buildAccordion(searchGroup,liClass,display);
            document.getElementById('accordion').innerHTML = html;
        }
        const Accordion = function (el, multiple) {
            this.el = el || {};
            this.multiple = multiple || false;
            const links = this.el.find('.dd');
            links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown);
        };
        Accordion.prototype.dropdown = function (e) {
            const $el = e.data.el;
            $this = $(this), $next = $this.next();
            $next.slideToggle();
            $this.parent().toggleClass('open');
            if (!e.data.multiple) {
                $el.find('.submenu').not($next).slideUp("20").parent().removeClass('open');
            }
        };
        new Accordion($('#accordion'), false);
    }
}

function buildAccordion(apiGroups, liClass, display) {
    let html = "";
    let doc;
    if (apiGroups.length > 0) {
         if (apiDocListSize == 1) {
            let apiData = apiGroups[0].list;
            for (let j = 0; j < apiData.length; j++) {
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiData[j].link + '">' + apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                html += '<ul class="sectlevel2" style="'+display+'">';
                doc = apiData[j].list;
                for (let m = 0; m < doc.length; m++) {
                    let spanString;
                    if (doc[m].deprecated == 'true') {
                        spanString='<span class="line-through">';
                    } else {
                        spanString='<span>';
                    }
                    html += '<li><a href="#_1_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                }
                html += '</ul>';
                html += '</li>';
            }
        } else {
            for (let i = 0; i < apiGroups.length; i++) {
                let apiGroup = apiGroups[i];
                html += '<li class="'+liClass+'">';
                html += '<a class="dd" href="#_' + apiGroup.name + '">' + apiGroup.order + '.&nbsp;' + apiGroup.name + '</a>';
                html += '<ul class="sectlevel1">';

                let apiData = apiGroup.list;
                for (let j = 0; j < apiData.length; j++) {
                    html += '<li class="'+liClass+'">';
                    html += '<a class="dd" href="#_'+apiGroup.order+'_'+ apiData[j].order + '_'+ apiData[j].link + '">' +apiGroup.order+'.'+ apiData[j].order + '.&nbsp;' + apiData[j].desc + '</a>';
                    html += '<ul class="sectlevel2" style="'+display+'">';
                    doc = apiData[j].list;
                    for (let m = 0; m < doc.length; m++) {
                       let spanString;
                       if (doc[m].deprecated == 'true') {
                           spanString='<span class="line-through">';
                       } else {
                           spanString='<span>';
                       }
                       html += '<li><a href="#_'+apiGroup.order+'_' + apiData[j].order + '_' + doc[m].order + '_' + doc[m].desc + '">'+apiGroup.order+'.' + apiData[j].order + '.' + doc[m].order + '.&nbsp;' + spanString + doc[m].desc + '<span></a> </li>';
                   }
                    html += '</ul>';
                    html += '</li>';
                }

                html += '</ul>';
                html += '</li>';
            }
        }
    }
    return html;
}