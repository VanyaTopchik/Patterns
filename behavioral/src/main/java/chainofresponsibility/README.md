**Цепочка обязанностей (Chain Of Responsibility)** - поведенческий паттерн проектирования, который позволяет передавать 
запросы последовательно по цепочке обработчиков. Каждый последующий обработчик решает, может ли он обработать запрос 
сам и стоит ли передавать запрос дальше по цепи.

Используется, когда:
+ Когда программа должна обрабатывать разнообразные запросы несколькими способами, но заранее неизвестно,
какие конкретно запросы будут приходить и какие обработчики для них понадобятся.
+ Когда важно, чтобы обработчики выполнялись один за другим в строгом порядке.
+ Когда набор объектов, способных обработать запрос, должен задаваться динамически.

Преимущества:
+ Уменьшает зависимость между клиентом и обработчиками.
+ Реализует принцип единственной обязанности.
+ Реализует принцип открытости/закрытости.

Недостатки: 
+ Запрос может остаться никем не обработанным.
