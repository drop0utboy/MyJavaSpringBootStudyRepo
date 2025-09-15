<template>
  <div class="card">
    <div class="card-header">
      board list
    </div>
    <div class="card-body">
      <div v-if="$store.state.user !== ''">
        <router-link class='btn btn-info btn-sm' to="BoardWrite">글쓰기</router-link>
      </div>

      <table class="table table-striped table-bordered">
        <thead>
          <tr>
            <th class="text-center" style="width:70px">번호</th>
            <th class="text-center">제목</th>
            <th class="text-center" style="width:90px">글쓴이</th>
            <th class="text-center" style="width:120px">날짜</th>
            <th class="text-center" style="width:70px">조회수</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="board in page.boards" :key="board.bno">
            <td class="text-center">{{ board.bno }}</td>
            <td class="text-center">{{ board.btitle }}</td>
            <td class="text-center">{{ board.bwriter }}</td>
            <td class="text-center">{{ board.bdate.substring(0, 10) }}</td>
            <td class="text-center">{{ board.bhitcount }}</td>
          </tr>

          <tr>
            <td colspan="5" class="text-center">
              <button class="btn btn-outline-primary btn-sm me-1" @click="changePageNo(1)">처음</button>
              <button v-if="page.pager.groupNo > 1" class="btn btn-outline-info btn-sm me-1" @click="changePageNo(page.pager.startPageNo - 1)">이전</button>

              <button v-for="pno in page.pager.pageArray" :key="pno" class="btn btn-sm me-1" :class="{
                'btn-danger': pageNo == pno,
                'btn-outline-success': pageNo != pno
              }" @click="changePageNo(pno)">
                {{ pno }}
              </button>
              <!-- <button v-for="pno in page.pager.pageArray" :key="pno" class="btn btn-outline-success btn-sm me-1" @click="changePageNo(pno)">{{ pno }}</button> -->

              <button v-if="page.pager.groupNo < page.pager.totalGroupNo" class="btn btn-outline-info btn-sm me-1" @click="changePageNo(page.pager.endPageNo + 1)">다음</button>
              <button class="btn btn-outline-primary btn-sm me-1" @click="changePageNo(page.pager.totalPageNo)">맨끝</button>
            </td>
          </tr>



        </tbody>
      </table>



    </div>
  </div>
</template>




<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref, watch } from 'vue';
import boardApi from "@/apis/boardApi"
import { useRoute, useRouter } from 'vue-router';

const router = useRouter();
const route = useRoute();

const pageNo = ref(route.query.pageNo || 1);

const page = ref({
  pager: {},
  boards: []
});

async function getBoardList(pageNo) {
  try {
    const response = await boardApi.getBoardList(pageNo);
    page.value.pager = response.data.pager;
    page.value.boards = response.data.boards;
  } catch (error) {
    console.log(error);
  }
}



function changePageNo(pageNo) {
  router.push(`BoardList?pageNo=${pageNo}`);
}

getBoardList(pageNo.value);

watch(route, (newRoute, oldRoute) => {
  if (newRoute.query.pageNo) {
    getBoardList(newRoute.query.pageNo);
    pageNo.value = newRoute.query.pageNo;
  } else {
    getBoardList(1);
    pageNo.value = 1;
  }
});



</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>