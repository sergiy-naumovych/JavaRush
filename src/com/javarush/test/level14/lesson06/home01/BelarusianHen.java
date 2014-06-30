package com.javarush.test.level14.lesson06.home01;

/**
 * Created by SERGE on 19.03.14.
 */
class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10000;
    }

    @Override
    String getDescription()
    {
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
