**Iterator (Итератор)** - поведенческий паттерн проектирования, который даёт возможность последовательно обходить
элементы составных объектов, не раскрывая их внутреннего представления.

Используется, когда:
+ Когда у вас есть сложная структура данных, и вы хотите скрыть от клиента детали её реализации
(из-за сложности или вопросов безопасности).
+ Когда вам нужно иметь несколько вариантов обхода одной и той же структуры данных.
+ Когда вам хочется иметь единый интерфейс обхода различных структур данных.

Преимущества:
+ Упрощает классы хранения данных.
+ Позволяет реализовать различные способы обхода структуры данных.
+ Позволяет одновременно перемещаться по структуре данных в разные стороны.

Недостатки:
+ Не оправдан, если можно обойтись простым циклом.
