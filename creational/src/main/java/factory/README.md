**Фабрика (Factory)** — это общая концепция проектирования, когда какая-то одна часть программы отвечает за создание других
частей программы.
Логика создания объекта инкапсулирована в одном месте.

**Static Factory Method (Статический фабричный метод)/Creation method (Создающий метод)** - Метод-обёртка над вызовом
конструктора.
У конструктора появляется имя. Мы можем реализовать дополнительную логику.

**Simple Factory (Простая фабрика)** - Класс, в котором есть метод с условным оператором, выбирающий создаваемый продукт.

**Factory Method (Фабричный метод)** - порождающий паттерн проектирования, который определяет общий интерфейс для создания 
объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.

Используется, когда:
+ Когда заранее неизвестны типы и зависимости объектов, с которыми должен работать ваш код.
+ Когда вы хотите дать возможность пользователям расширять части вашего фреймворка или библиотеки.
+ Когда вы хотите экономить системные ресурсы, повторно используя уже созданные объекты, вместо порождения новых.

Преимущества:
+ Избавляет класс от привязки к конкретным классам продуктов.
+ Выделяет код производства продуктов в одно место, упрощая поддержку кода.
+ Упрощает добавление новых продуктов в программу.
+ Реализует принцип открытости/закрытости.

Недостатки:
+ Может привести к созданию больших параллельных иерархий классов, так как для каждого класса продукта надо создать свой подкласс создателя.

**Abstract Factory (Абстрактная фабрика)** - порождающий паттерн проектирования, который позволяет создавать семейства 
связанных объектов, не привязываясь к конкретным классам создаваемых объектов.

Используется, когда:
+ Когда бизнес-логика программы должна работать с разными видами связанных друг с другом продуктов, не завися от конкретных классов продуктов.
+ Когда в программе уже используется Фабричный метод, но очередные изменения предполагают введение новых типов продуктов.

Преимущества:
+ Гарантирует сочетаемость создаваемых продуктов.
+ Избавляет клиентский код от привязки к конкретным клас- сам продуктов.
+ Выделяет код производства продуктов в одно место, упро- щая поддержку кода.
+ Упрощает добавление новых продуктов в программу.
+ Реализует принцип открытости/закрытости.

Недостатки:
+ Усложняет код программы из-за введения множества дополнительных классов.
+ Требует наличия всех типов продуктов в каждой вариации.