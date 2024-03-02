# Opp
# Anuphong puangkham

if ((row < 1 || row < board.board.length  + 1) && (col < 1 || col < board.board.length + 1)) {
                if ((board.board[row - 1 ][col - 1] != null) && (board.board[row - 1][col - 1].iswhite == this.iswhite)) {
                    continue;
                } else if ((this.CurrentPositionRow != row) && (this.CurrentPositionCol != col)) {
                    this.movableList.add(First);
                }