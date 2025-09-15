import axios from "axios";

function getBoardList(pageNo = 1) {
  return axios.get("/db/board-list", {params: {pageNo}});
}

export default {
  getBoardList
};