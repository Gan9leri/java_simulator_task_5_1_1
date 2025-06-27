# Домашнее задание к курсу [Java тренажер](https://stepik.org/course/182389/syllabus?search=7262451423): Урок 5.1.1
## :scroll: Содержание:

- [Используемый стек](#computer-используемый-стек)
- [Задание](#pushpin-Задание)

##  :computer: Используемый стек

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="media/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="media/logo/Java.svg" width="50" height="50"  alt="JAVA"/></a>
<a href="https://gradle.org/"><img src="media/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://github.com/"><img src="media/logo/GitHub.svg" width="50" height="50"  alt="GITHUB"/></a>

## :pushpin: Задание:

У вас есть переменная n которая содержит входные пользовательские данные.

n - положительное целое число

У вас есть положительное целое число n, представляющее количество шляп и количество людей. Нужно определить общее количество способов, которыми n шляп можно вернуть n людям таким образом, что ни одна шляпа не возвращается к своему владельцу (т.е., ни один человек не получает свою собственную шляпу).

<img src="media/images/img.PNG" alt="field"/>

Эта задача известна как "проблема шляпного чека" или "проблема нарушения перестановок".

Ответ на эту задачу представляет собой количество !n нарушений n-элементного набора.

>Нарушение — это такая перестановка элементов множества, при которой ни один элемент не появляется в исходном положении.

Результат записать в виде числа в переменную result.

>Sample Input1:
>
>2

>Sample Output1:
>
>1

>Sample Input2:
>
>3

>Sample Output1:
>
>2