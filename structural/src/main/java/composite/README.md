**Компоновщик (Composite)** - структурный паттерн проектирования, который позволяет сгруппировать множество объектов в
древовидную структуру, а затем работать с ней так, как будто это единичный объект.

Используется, когда:
+ Когда вам нужно представить древовидную структуру объектов.
+ Когда клиенты должны единообразно трактовать простые и составные объекты.

Преимущества:
+ Упрощает архитектуру клиента при работе со сложным деревом компонентов.
+ Облегчает добавление новых видов компонентов.

Недостатки:
+ Создаёт слишком общий дизайн классов.
