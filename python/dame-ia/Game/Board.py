from Game.Case import Case
import logging

logger = logging.getLogger()


class Board(object):
    cases = []

    def __init__(self):
        self.init_board()

    def init_board(self):
        for i in range(1, 51):
            self.cases.append(Case(i))

        for case in self.cases[0:20]:
            case.color = 'black'

        for case in self.cases[30:50]:
            case.color = 'white'

    def print_board(self):
        cases = self.cases
        print("╔═══════════════════╗")
        print("║. " + self.print_case(cases[0]) + " . " + self.print_case(cases[1]) + " . " + self.print_case(
            cases[2]) + " . " + self.print_case(cases[3]) + " . " + self.print_case(cases[4]) + "║")
        print("║" + self.print_case(cases[5]) + " . " + self.print_case(cases[6]) + " . " + self.print_case(
            cases[7]) + " . " + self.print_case(cases[8]) + " . " + self.print_case(cases[9]) + " .║")
        print("║. " + self.print_case(cases[10]) + " . " + self.print_case(cases[11]) + " . " + self.print_case(
            cases[12]) + " . " + self.print_case(cases[13]) + " . " + self.print_case(cases[14]) + "║")
        print("║" + self.print_case(cases[15]) + " . " + self.print_case(cases[16]) + " . " + self.print_case(
            cases[17]) + " . " + self.print_case(cases[18]) + " . " + self.print_case(cases[19]) + " .║")
        print("║. " + self.print_case(cases[20]) + " . " + self.print_case(cases[21]) + " . " + self.print_case(
            cases[22]) + " . " + self.print_case(cases[23]) + " . " + self.print_case(cases[24]) + "║")
        print("║" + self.print_case(cases[25]) + " . " + self.print_case(cases[26]) + " . " + self.print_case(
            cases[27]) + " . " + self.print_case(cases[28]) + " . " + self.print_case(cases[29]) + " .║")
        print("║. " + self.print_case(cases[30]) + " . " + self.print_case(cases[31]) + " . " + self.print_case(
            cases[32]) + " . " + self.print_case(cases[33]) + " . " + self.print_case(cases[34]) + "║")
        print("║" + self.print_case(cases[35]) + " . " + self.print_case(cases[36]) + " . " + self.print_case(
            cases[37]) + " . " + self.print_case(cases[38]) + " . " + self.print_case(cases[39]) + " .║")
        print("║. " + self.print_case(cases[40]) + " . " + self.print_case(cases[41]) + " . " + self.print_case(
            cases[42]) + " . " + self.print_case(cases[43]) + " . " + self.print_case(cases[44]) + "║")
        print("║" + self.print_case(cases[45]) + " . " + self.print_case(cases[46]) + " . " + self.print_case(
            cases[47]) + " . " + self.print_case(cases[48]) + " . " + self.print_case(cases[49]) + " .║")
        print("╚═══════════════════╝")

    def print_case(self, case):
        return '□' if case.color == 'black' else '■' if case.color == 'white' else '.'

    def find_case(self, position):
        for case in self.cases:
            if case.position == position:
                return case
        logger.error('Failed to find case')

    def make_move(self, from_position, to_position):
        from_case = self.find_case(from_position)
        to_case = self.find_case(to_position)
        next_position = self.next_position(from_case, to_case)
        move = self.allowed_move(from_case, to_case)

        if move == 'next':
            to_case.color = ''
            self.find_case(next_position).color = from_case.color
            from_case.color = ''
            return self
        if self.allowed_move(from_case, to_case):
            to_case.color = from_case.color
            from_case.color = ''
            return self
        else:
            logger.error("Déplacement impossible")
            return self

    def allowed_move(self, from_case, to_case):
        possible_moves = self.possible_move(from_case)
        next_position = self.next_position(from_case, to_case)
        if to_case.position not in possible_moves:
            logger.error('La case voulu est hors de portée')
            return False
        if self.can_eat_pion(from_case, to_case) is False and (
                (from_case.color == 'black' and from_case.position > to_case.position)
                or
                (from_case.color == 'white' and from_case.position < to_case.position)):
            logger.error('Impossible de reculer !')
            return False
        if from_case.color == to_case.color:
            logger.error('La case est déjà occupé par un pion allié')
            return False
        if from_case.color != to_case.color and from_case.color == self.find_case(next_position).color:
            logger.error('En prenant le pion à la position, le pion suivant est allié')
            return False

        if self.can_eat_pion(from_case, to_case) and self.find_case(next_position).color == '':
            return 'next'
        if to_case.color == '':
            return True

        logger.critical('Cas non géré!!!')
        exit(1)

    def next_position(self, from_case, to_case):
        possible_moves = self.possible_move(from_case)
        index = possible_moves.index(to_case.position)
        if from_case.position in [1, 2, 3, 4, 6, 15, 16, 25, 26, 35, 36, 45, 47, 48, 49, 50]:
            if index == 0:
                index = 1
            else:
                index = 3
        possible_moves = self.possible_move(to_case)
        return possible_moves[index]

    def can_eat_pion(self, from_case, to_case):
        if from_case.color == 'white' and to_case.color == 'black':
            return True
        if from_case.color == 'black' and to_case.color == 'white':
            return True
        return False

    def possible_move(self, from_case):
        switcher = {
            1: [6, 7],
            2: [7, 8],
            3: [8, 9],
            4: [9, 10],
            5: [10],
            6: [1, 11],
            7: [1, 2, 11, 12],
            8: [2, 3, 12, 13],
            9: [3, 4, 13, 14],
            10: [4, 5, 14, 15],
            11: [6, 7, 16, 17],
            12: [7, 8, 17, 18],
            13: [8, 9, 18, 19],
            14: [9, 10, 19, 20],
            15: [10, 20],
            16: [11, 21],
            17: [11, 12, 21, 22],
            18: [12, 13, 22, 23],
            19: [13, 14, 23, 24],
            20: [14, 15, 24, 25],
            21: [16, 17, 26, 27],
            22: [17, 18, 27, 28],
            23: [18, 19, 28, 29],
            24: [19, 20, 29, 30],
            25: [20, 30],
            26: [21, 31],
            27: [21, 22, 31, 32],
            28: [22, 23, 32, 33],
            29: [23, 24, 33, 34],
            30: [24, 25, 34, 35],
            31: [26, 27, 36, 37],
            32: [27, 28, 37, 38],
            33: [28, 29, 38, 39],
            34: [29, 30, 39, 40],
            35: [30, 40],
            36: [31, 41],
            37: [31, 32, 41, 42],
            38: [32, 33, 42, 43],
            39: [33, 34, 43, 44],
            40: [34, 35, 43, 44],
            41: [36, 37, 46, 47],
            42: [37, 38, 47, 48],
            43: [38, 39, 48, 49],
            44: [39, 40, 39, 50],
            45: [40, 50],
            46: [41],
            47: [41, 42],
            48: [42, 43],
            49: [43, 44],
            50: [44, 45]
        }
        return switcher.get(from_case.position)
