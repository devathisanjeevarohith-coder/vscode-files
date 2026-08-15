from car import Car

# Object = A "bundle" of related attributes (variables) and methods (functions)
#          Ex. phone, cup, book
#          You need a "class" to create any objects

# Class =  (blueprint) used to  design the structure and layout of an object



# You could just place the car class in this file instead of creating a whole new File

car1 = Car("Mustang",  2024, "Red", False)
car2 = Car("Corvette", 2025, "Blue", True)
car3 = Car("Charger", 2026, "Yellow", True)

print(car1.model)
print(car1.year)
print(car1.color)
print(car1.for_sale)

print(car2.model)
print(car2.year)
print(car2.color)
print(car2.for_sale)

print(car3.model)
print(car3.year)
print(car3.color)
print(car3.for_sale)

car1.drive()
car2.drive()
car3.drive()

car1.stop()
car2.stop()
car3.stop()