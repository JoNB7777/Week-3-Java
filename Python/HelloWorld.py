# var1 = int(input('Enter a first integer: '))
# var2 = int(input('Enter a second integer: '))

# if var1 > 21:
#     if var2 > 21:
#         print(0)
#     else:
#         print(var2)
# elif var2 > 21:
#     print(var1)
# else:
#     print(max(var1, var2))

# x = int(input('Enter a first number: '))
# y = int(input('Enter a second number: '))
# z = int(input('Enter a third number: '))

# if x == y:
#     if x == z:
#         sum = x
#     else:
#         sum = x + z
# elif x == z:
#     sum = x + y
# elif y == z:
#     sum = x + y
# else:
#     sum = x+y+z

# print(sum)

# def add_variables(x: int, y: int, z: bool):
#     if (x < 0  or x > 0) and (y < 0 or y > 0):
#         if z == True:
#             result =x + y
#         else:
#             result = x*y
    
#     else:
#         if x == 0:
#             result = y

#         else:
#             result = x

#     return result

# print(add_variables(1,2, True))

# b = int(input('Enter a number: '))
# for a in range (0, 10):
#     add_variables(a, b, False)

# list1 = [4, 7, 11, 16, 23, 25, 29, 40, 47, 0]
# for a in range(0, len(list1)):
#     print(list1[a])

# list1 = []
# counter1 = int(input("Enter a number between 1 and 50: "))
# for a in range (0, counter1):
#     list1.append(a)
#     print(list1)

# for elem in list1:
#     var1 = list1.index(elem)
#     elem_new = 10*elem
#     list1.remove(elem)
#     list1.insert(var1, elem_new)
#     print(list1)

# def double_numbers(x: float):
#     result = 2*x
#     return result

# def triple_numbers(x: float):
#     result = 3*x
#     return result

# number_1 = float(input('Enter a number: '))
# print(double_numbers(number_1))
# print(triple_numbers(number_1))

# def is_it_too_hot(temperature: int, is_Summer: bool):
#     result = False
#     if is_Summer:
#         if temperature in range (60, 101):
#             result = True
#     else:
#         if temperature in range (60, 91):
#             result = True
#     return result

# print(is_it_too_hot(59, True))
# print(is_it_too_hot(59, False))
# print(is_it_too_hot(60, True))
# print(is_it_too_hot(60, False))
# print(is_it_too_hot(90, True))
# print(is_it_too_hot(90, False))
# print(is_it_too_hot(100, True))
# print(is_it_too_hot(100, False))

# def is_leap_year(year: int):
#     if year % 4 == 0:
#         if year % 100 == 0:
#             if year % 400 == 0:
#                 result = True
#             else:
#                 result = False
#         else:
#             result = True
#     else:
#         result = False
    
#     return result

# print(is_leap_year(1600))
# print(is_leap_year(1700))
# print(is_leap_year(2000))
# print(is_leap_year(2020))
# print(is_leap_year(2019))

counter = 0

def tins_needed_cheapo_max(roomsize: float):
    while 20*10*counter:
        counter += 1
    tins_needed = 20*10*counter
    return tins_needed

def tins_needed_average_joes(roomsize: float):
    while 15*11*counter:
        counter += 1
    tins_needed = 15*11*counter
    return tins_needed

def tins_needed_duluxourous_paints(roomsize: float):
    while 25*20*counter:
        counter += 1
    tins_needed = 25*20*counter
    return tins_needed

def costs_cheapo_max(roomsize: float):
    tins_needed = tins_needed_cheapo_max(roomsize)
    costs = tins_needed*19.99
    return costs

def costs_average_joes(roomsize: float):
    tins_needed = tins_needed_average_joes(roomsize)
    costs = tins_needed*17.99
    return costs

def costs_duluxourous_paints(roomsize: float):
    tins_needed = tins_needed_duluxourous_paints(roomsize)
    costs = tins_needed*25
    return costs

def paint_wasted_cheapo_max(roomsize: float):
    tins_needed = tins_needed_cheapo_max(roomsize)
    paint_wasted = 10*tins_needed - roomsize
    return paint_wasted

def paint_wasted_average_joes(roomsize: float):
    tins_needed = tins_needed_average_joes(roomsize)
    paint_wasted = 11*tins_needed - roomsize
    return paint_wasted

def paint_wasted_duluxourous_paints(roomsize: float):
    tins_needed = tins_needed_duluxourous_paints(roomsize)
    paint_wasted = 20*tins_needed - roomsize
    return paint_wasted

def find_cheapest_paint_for_room(roomsize: float):
    pass

def find_least_wasteful_paint_for_room(roomsize: float):
    pass




    

        
