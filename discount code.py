book_cost = 150
pen_cost = 10
notebook_cost = 25

books = 2
pens = 5
notebooks = 3

total_cost = (book_cost * books) + (pen_cost * pens) + (notebook_cost * notebooks)
print(total_cost)

if total_cost > 350:
    discount = total_cost * 0.15
    total_cost -= discount
    print('The customer receives a 15% discount')
    print(total_cost)
else:
    print('The customer do not receive a discount.')
    