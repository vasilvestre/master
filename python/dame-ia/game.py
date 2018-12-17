from Game.Board import Board
from Game.Player import Player
import logging

logger = logging.getLogger()
board = Board()
white_player = Player('white')
black_player = Player('black')

from_position = 0
to_position = 0

while not board.victory:
    print("White player at you")
    valid_move = False
    while not valid_move:
        from_position = int(input("Choose from case number"))
        to_position = int(input("Choose destination case number"))
        valid_move = board.valid_move(from_position, to_position, white_player)
        if not valid_move:
            print("Invalid move")

    board.make_move(from_position, to_position)
    board.print_board()

    print("Black player at you")
    valid_move = False
    while not valid_move:
        from_position = int(input("Choose from case number"))
        to_position = int(input("Choose destination case number"))
        valid_move = board.valid_move(from_position, to_position, black_player)
        if not valid_move:
            print("Invalid move")

    board.make_move(from_position, to_position)
    board.print_board()