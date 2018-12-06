from Game.Board import Board
from Game.Player import Player

board = Board()
white_player = Player('white')
black_player = Player('black')

while not board.victory:
    
    board = board.make_move(31, 26)
    board.print_board()

    board = board.make_move(16, 21)
    board.print_board()

    board = board.make_move(17, 22)
    board.print_board()

    board = board.make_move(26, 21)
    board.print_board()

    board = board.make_move(17, 22)
    board.print_board()