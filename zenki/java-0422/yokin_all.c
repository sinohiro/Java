#include <stdio.h>
#include <stdlib.h>

struct Yokin        /* 預金構造体 */
{
    double riritsu; /* 利率 */
    int gankin;	    /* 元金 */
};

void Yokin_syokika(struct Yokin *yokin) /* 預金構造体のメンバーを初期化 */
{
    yokin->riritsu = 0.002;
}

double Yokin_risoku(struct Yokin *yokin, int month) /* 利息を計算 */
{
    double kekka;
    kekka = (double)(yokin->gankin) * (yokin->riritsu) * (double)month / 12.0;
    return kekka;
}

int main(int argc, char *argv[])
{
    double kotae;

    struct Yokin *myyokin;
    myyokin = (struct Yokin *)malloc(sizeof(struct Yokin));
    Yokin_syokika(myyokin);

    myyokin->gankin = 100000;
    kotae = Yokin_risoku(myyokin, 3);
    printf("利息は%lf\n", kotae);

    exit(0);
}
