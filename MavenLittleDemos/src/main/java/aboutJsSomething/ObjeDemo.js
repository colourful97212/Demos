/**
 * 一、通过”字面量“方式创建
 * @type {{work: person.work, name: string}}
 */

var person = {
    name: "gg",
    work: function () {
        console.log('coding')
    }
};

var person2= {}; //创建空对象

person.work();

person.worker = 'coding'; //丰富成员信息





/**
 * 二、通过”构造函数“方式创建
 * @constructor
 */

function Person3() {
    this.name = "dongjc";    //通过this关键字设置默认成员
    var worker = 'coding';    //没有this关键字，对象创建后，该变量为非成员
    this.age = 32;
    this.Introduce = function () {
        alert("My name is " + this.name + ".I'm " + this.age);
    };
    alert("My name is " + this.name + ".I'm " + this.age);
}

var person4 = new Person3();

person4.Introduce();


/**
 * 三、通过object方式创建
 * @type {Object}
 */

var person5 = new Object();
person5.name = "dongjc";
person5.age = 32;
person5.Introduce = function () {
    alert("My name is " + this.name + ".I'm " + this.age);
};
person5.Introduce();


/**
 *  四、使用工厂模式创建对象
 */

'use strict';
// 使用工厂模式创建对象
// 定义一个工厂方法
function createObject(name) {
    var o = new Object();
    o.name = name;
    o.sayName = function() {
        alert(this.name);
    };
    return o;
}

var o1 = createObject('zhang');
var o2 = createObject('li');

//缺点：调用的还是不同的方法
//优点：解决了前面的代码重复的问题
alert(o1.sayName === o2.sayName); //false


/**
 * 五、通过原型模式创建对象
 */

'use strict';

/*
 *  原型模式创建对象
 */
function Animal() {}

Animal.prototype.name = 'animal';
Animal.prototype.sayName = function() {
    alert(this.name);
};

var a1 = new Animal();
var a2 = new Animal();

a1.sayName();

alert(a1.sayName === a2.sayName); //true
alert(Animal.prototype.constructor); //function Animal(){}
alert(Animal); //function Animal(){}
alert(Animal.prototype.constructor == Animal); //true