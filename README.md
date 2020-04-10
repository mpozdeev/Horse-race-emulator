Horse-race-emulator

Task: Horse race emulator 

Implement horse race emulator using XML configuration. 

Required beans: 
- HorseService for horse management (horses with their riders, breeds and other characteristics should be obtained from the configuration) 
- RaceService for simple getRace() method which generates and returns information about the upcoming race (horses can be choosen randomly) 
- EmulationService for real-time race emulation (it generates data about horses positions on the console for every second) 

Main domain objects: Horse, Race, Rider, Breed. 

Add client code: 
- On start-up application shows the information about upcoming race. 
- User is offered to choose his horse (make a bet) with searching by name, breed, rider’s name 
- After that a race emulation starts 

Winner announcement is displayed 
(Nothing super-fancy in UI, just console application) 


***** Перевод: *****
Задача: эмулятор скачек
Реализуйте эмулятор скачек, используя конфигурацию XML.

Требуемые бины:
- HorseService для управления лошадьми (лошади с их наездниками, породами и другими характеристиками должны быть 
    получены из конфигурации)
    
- RaceService для простого метода getRace(), который генерирует и возвращает информацию о предстоящей гонке (лошади
    могут быть выбраны случайным образом)
    
- EmulationService для эмуляции гонки в реальном времени (генерирует данные о позициях лошадей на консоли каждую секунду)

Основные доменные объекты: Лошадь, Гонка, Всадник, Порода.

Добавить код клиента:
- На стартовом приложении отображается информация о предстоящей гонке.
- Пользователю предлагается выбрать свою лошадь (сделать ставку) с поиском по имени, породе, имени всадника
- После этого начинается эмуляция гонки

Отображается объявление победителя (Ничего сверхъестественного в пользовательском интерфейсе, только консольное приложение)