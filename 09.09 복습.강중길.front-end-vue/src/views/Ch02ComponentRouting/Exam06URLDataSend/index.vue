<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      URL data send
    </div>
    <div class="card-body">
      <ul>
        <li>
          <router-link :to="`Exam06URLDataRecieve/${uname}/${uage}`">Exam06URLDataRecieve</router-link>
        </li>

        <li>
          <router-link :to="`Exam06URLDataRecieve?bno=${boardInfo.bno}&bkind=${boardInfo.bkind}`">Exam06URLDataRecieve</router-link>
        </li>
      </ul>

      <p><button class="btn btn-info btn-sm " @click="fun1()">Exam06URLDataRecieve</button></p>
      <p><button class="btn btn-info btn-sm " @click="fun2()">Exam06URLDataRecieve</button></p>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
// 자바스크립트를 작성
import { useRouter } from 'vue-router';

let uname = "홍길동";
let uage = 29;

const boardInfo = {
  bno: 4,
  bkind: "paidboard"
};

const router = useRouter();

async function fun1() {

  await router.push(`Exam06URLDataRecieve/${uname}/${uage}`);
}

async function fun2() {
  await router.push(`Exam06URLDataRecieve?bno=${boardInfo.bno}&bkind=${boardInfo.bkind}`);
}


</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>