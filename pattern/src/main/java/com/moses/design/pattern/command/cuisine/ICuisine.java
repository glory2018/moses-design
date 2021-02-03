package com.moses.design.pattern.command.cuisine;

/**
 * 菜系
 * 01、山东（鲁菜）——宫廷最大菜系，以孔府风味为龙头。
 * 02、四川（川菜）——中国最有特色的菜系，也是民间最大菜系。
 * 03、江苏（苏菜）——宫廷第二大菜系，古今国宴上最受人欢迎的菜系。
 * 04、广东（粤菜）——国内民间第二大菜系，国外最有影响力的中国菜系，可以代表中国。
 * 05、福建（闽菜）——客家菜的代表菜系。
 * 06、浙江（浙菜）——中国最古老的菜系之一，宫廷第三大菜系。
 * 07、湖南（湘菜）——民间第三大菜系。
 * 08、安徽（徽菜）——徽州文化的典型代表。
 */
public interface ICuisine {
    void cook(); // 烹调、制作
}
